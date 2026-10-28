package com.whoop.design.atomic.organism.toolbar;

import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import hy0.C17750h1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jh3.AbstractC21702c;
import kd1.AbstractC22403o;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27274q;
import o81.C27656a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q63.AbstractC30007c;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: com.whoop.design.atomic.organism.toolbar.d */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0004\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/toolbar/d;", "", "<init>", "()V", "a", "b", "c", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "Lcom/whoop/design/atomic/organism/toolbar/d$c;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6721d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b */
    public static final int f25640b = 0;

    /* JADX INFO: renamed from: com.whoop.design.atomic.organism.toolbar.d$b, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/toolbar/d$b;", "", "<init>", "()V", "Lcom/whoop/design/util/TextResource;", "title", "Lcom/whoop/design/atomic/organism/toolbar/d$a;", "a", "(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;", "", "titleAutomationTag", "closeAutomationTag", "b", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/atomic/organism/toolbar/d$a;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ a m20172c(Companion companion, TextResource textResource, String str, String str2, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                str = null;
            }
            if ((i13 & 4) != 0) {
                str2 = null;
            }
            return companion.m20174b(textResource, str, str2);
        }

        /* JADX INFO: renamed from: a */
        public final a m20173a(TextResource title) {
            AbstractC22676k.m65750j(title, "title");
            return new a(title, null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), "Back", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
        }

        /* JADX INFO: renamed from: b */
        public final a m20174b(TextResource title, String titleAutomationTag, String closeAutomationTag) {
            AbstractC22676k.m65750j(title, "title");
            return new a(title, null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21277k(AbstractC16277f.f62253K)), null, null, null, false, null, null, null, null, null, null, titleAutomationTag, closeAutomationTag, 8186, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractC6721d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC6721d() {
    }

    /* JADX INFO: renamed from: com.whoop.design.atomic.organism.toolbar.d$c */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0098\u0001\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b&\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b/\u0010,R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b(\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b-\u00102R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u00104\u001a\u0004\b0\u00105R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/toolbar/d$c;", "Lcom/whoop/design/atomic/organism/toolbar/d;", "Lcom/whoop/design/util/TextResource;", "data", "title", "subtitle", "", "leftIcon", "", "contentDescriptionLeftIcon", "rightIcon", "contentDescriptionRightIcon", "Lkd1/o;", "dataIcon", "contentDescriptionDataIcon", "Lny0/q;", "leftIconButtonType", "rightIconButtonType", "Ly81/f;", "rightIconColor", "leftIconColor", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;)V", "a", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;)Lcom/whoop/design/atomic/organism/toolbar/d$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/whoop/design/util/TextResource;", "f", "()Lcom/whoop/design/util/TextResource;", "d", "m", "e", "l", "Ljava/lang/Integer;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/lang/Integer;", "g", "Ljava/lang/String;", "j", "i", "Lkd1/o;", "()Lkd1/o;", "k", "Lny0/q;", "()Lny0/q;", "n", "Ly81/f;", "getRightIconColor", "()Ly81/f;", "o", "getLeftIconColor", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC6721d {

        /* JADX INFO: renamed from: p */
        public static final int f25657p = 0;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource data;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final TextResource subtitle;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final Integer leftIcon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String contentDescriptionLeftIcon;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final Integer rightIcon;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final String contentDescriptionRightIcon;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final AbstractC22403o dataIcon;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final String contentDescriptionDataIcon;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final AbstractC27274q leftIconButtonType;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final AbstractC27274q rightIconButtonType;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final EnumC39333f rightIconColor;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final EnumC39333f leftIconColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextResource data, TextResource title, TextResource subtitle, Integer num, String contentDescriptionLeftIcon, Integer num2, String contentDescriptionRightIcon, AbstractC22403o abstractC22403o, String contentDescriptionDataIcon, AbstractC27274q leftIconButtonType, AbstractC27274q rightIconButtonType, EnumC39333f rightIconColor, EnumC39333f leftIconColor) {
            super(null);
            AbstractC22676k.m65750j(data, "data");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(contentDescriptionLeftIcon, "contentDescriptionLeftIcon");
            AbstractC22676k.m65750j(contentDescriptionRightIcon, "contentDescriptionRightIcon");
            AbstractC22676k.m65750j(contentDescriptionDataIcon, "contentDescriptionDataIcon");
            AbstractC22676k.m65750j(leftIconButtonType, "leftIconButtonType");
            AbstractC22676k.m65750j(rightIconButtonType, "rightIconButtonType");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(leftIconColor, "leftIconColor");
            this.data = data;
            this.title = title;
            this.subtitle = subtitle;
            this.leftIcon = num;
            this.contentDescriptionLeftIcon = contentDescriptionLeftIcon;
            this.rightIcon = num2;
            this.contentDescriptionRightIcon = contentDescriptionRightIcon;
            this.dataIcon = abstractC22403o;
            this.contentDescriptionDataIcon = contentDescriptionDataIcon;
            this.leftIconButtonType = leftIconButtonType;
            this.rightIconButtonType = rightIconButtonType;
            this.rightIconColor = rightIconColor;
            this.leftIconColor = leftIconColor;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ c m20175b(c cVar, TextResource textResource, TextResource textResource2, TextResource textResource3, Integer num, String str, Integer num2, String str2, AbstractC22403o abstractC22403o, String str3, AbstractC27274q abstractC27274q, AbstractC27274q abstractC27274q2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                textResource = cVar.data;
            }
            return cVar.m20176a(textResource, (i13 & 2) != 0 ? cVar.title : textResource2, (i13 & 4) != 0 ? cVar.subtitle : textResource3, (i13 & 8) != 0 ? cVar.leftIcon : num, (i13 & 16) != 0 ? cVar.contentDescriptionLeftIcon : str, (i13 & 32) != 0 ? cVar.rightIcon : num2, (i13 & 64) != 0 ? cVar.contentDescriptionRightIcon : str2, (i13 & 128) != 0 ? cVar.dataIcon : abstractC22403o, (i13 & 256) != 0 ? cVar.contentDescriptionDataIcon : str3, (i13 & 512) != 0 ? cVar.leftIconButtonType : abstractC27274q, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? cVar.rightIconButtonType : abstractC27274q2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? cVar.rightIconColor : enumC39333f, (i13 & 4096) != 0 ? cVar.leftIconColor : enumC39333f2);
        }

        /* JADX INFO: renamed from: a */
        public final c m20176a(TextResource data, TextResource title, TextResource subtitle, Integer leftIcon, String contentDescriptionLeftIcon, Integer rightIcon, String contentDescriptionRightIcon, AbstractC22403o dataIcon, String contentDescriptionDataIcon, AbstractC27274q leftIconButtonType, AbstractC27274q rightIconButtonType, EnumC39333f rightIconColor, EnumC39333f leftIconColor) {
            AbstractC22676k.m65750j(data, "data");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(subtitle, "subtitle");
            AbstractC22676k.m65750j(contentDescriptionLeftIcon, "contentDescriptionLeftIcon");
            AbstractC22676k.m65750j(contentDescriptionRightIcon, "contentDescriptionRightIcon");
            AbstractC22676k.m65750j(contentDescriptionDataIcon, "contentDescriptionDataIcon");
            AbstractC22676k.m65750j(leftIconButtonType, "leftIconButtonType");
            AbstractC22676k.m65750j(rightIconButtonType, "rightIconButtonType");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(leftIconColor, "leftIconColor");
            return new c(data, title, subtitle, leftIcon, contentDescriptionLeftIcon, rightIcon, contentDescriptionRightIcon, dataIcon, contentDescriptionDataIcon, leftIconButtonType, rightIconButtonType, rightIconColor, leftIconColor);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getContentDescriptionDataIcon() {
            return this.contentDescriptionDataIcon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getContentDescriptionLeftIcon() {
            return this.contentDescriptionLeftIcon;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getContentDescriptionRightIcon() {
            return this.contentDescriptionRightIcon;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return AbstractC22676k.m65745e(this.data, cVar.data) && AbstractC22676k.m65745e(this.title, cVar.title) && AbstractC22676k.m65745e(this.subtitle, cVar.subtitle) && AbstractC22676k.m65745e(this.leftIcon, cVar.leftIcon) && AbstractC22676k.m65745e(this.contentDescriptionLeftIcon, cVar.contentDescriptionLeftIcon) && AbstractC22676k.m65745e(this.rightIcon, cVar.rightIcon) && AbstractC22676k.m65745e(this.contentDescriptionRightIcon, cVar.contentDescriptionRightIcon) && AbstractC22676k.m65745e(this.dataIcon, cVar.dataIcon) && AbstractC22676k.m65745e(this.contentDescriptionDataIcon, cVar.contentDescriptionDataIcon) && AbstractC22676k.m65745e(this.leftIconButtonType, cVar.leftIconButtonType) && AbstractC22676k.m65745e(this.rightIconButtonType, cVar.rightIconButtonType) && this.rightIconColor == cVar.rightIconColor && this.leftIconColor == cVar.leftIconColor;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final TextResource getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC22403o getDataIcon() {
            return this.dataIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Integer getLeftIcon() {
            return this.leftIcon;
        }

        public int hashCode() {
            int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.data.hashCode() * 31, this.title, 31), this.subtitle, 31);
            Integer num = this.leftIcon;
            int iM30450d = AbstractC11266d.m30450d((iM95625a + (num == null ? 0 : num.hashCode())) * 31, 31, this.contentDescriptionLeftIcon);
            Integer num2 = this.rightIcon;
            int iM30450d2 = AbstractC11266d.m30450d((iM30450d + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.contentDescriptionRightIcon);
            AbstractC22403o abstractC22403o = this.dataIcon;
            return this.leftIconColor.hashCode() + AbstractC21702c.m61132c(this.rightIconColor, (this.rightIconButtonType.hashCode() + ((this.leftIconButtonType.hashCode() + AbstractC11266d.m30450d((iM30450d2 + (abstractC22403o != null ? abstractC22403o.hashCode() : 0)) * 31, 31, this.contentDescriptionDataIcon)) * 31)) * 31, 31);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final AbstractC27274q getLeftIconButtonType() {
            return this.leftIconButtonType;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getRightIcon() {
            return this.rightIcon;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final AbstractC27274q getRightIconButtonType() {
            return this.rightIconButtonType;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final TextResource getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        public String toString() {
            TextResource textResource = this.data;
            TextResource textResource2 = this.title;
            TextResource textResource3 = this.subtitle;
            Integer num = this.leftIcon;
            String str = this.contentDescriptionLeftIcon;
            Integer num2 = this.rightIcon;
            String str2 = this.contentDescriptionRightIcon;
            AbstractC22403o abstractC22403o = this.dataIcon;
            String str3 = this.contentDescriptionDataIcon;
            AbstractC27274q abstractC27274q = this.leftIconButtonType;
            AbstractC27274q abstractC27274q2 = this.rightIconButtonType;
            EnumC39333f enumC39333f = this.rightIconColor;
            EnumC39333f enumC39333f2 = this.leftIconColor;
            StringBuilder sbM106658q = AbstractC33745d.m106658q("LeftAligned(data=", textResource, ", title=", textResource2, ", subtitle=");
            sbM106658q.append(textResource3);
            sbM106658q.append(", leftIcon=");
            sbM106658q.append(num);
            sbM106658q.append(", contentDescriptionLeftIcon=");
            AbstractC30007c.m91853w(num2, str, ", rightIcon=", ", contentDescriptionRightIcon=", sbM106658q);
            sbM106658q.append(str2);
            sbM106658q.append(", dataIcon=");
            sbM106658q.append(abstractC22403o);
            sbM106658q.append(", contentDescriptionDataIcon=");
            sbM106658q.append(str3);
            sbM106658q.append(", leftIconButtonType=");
            sbM106658q.append(abstractC27274q);
            sbM106658q.append(", rightIconButtonType=");
            sbM106658q.append(abstractC27274q2);
            sbM106658q.append(", rightIconColor=");
            sbM106658q.append(enumC39333f);
            sbM106658q.append(", leftIconColor=");
            return AbstractC21702c.m61138i(sbM106658q, enumC39333f2, ")");
        }

        public /* synthetic */ c(TextResource textResource, TextResource textResource2, TextResource textResource3, Integer num, String str, Integer num2, String str2, AbstractC22403o abstractC22403o, String str3, AbstractC27274q abstractC27274q, AbstractC27274q abstractC27274q2, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? AbstractC8693b.m21267a() : textResource2, (i13 & 4) != 0 ? AbstractC8693b.m21267a() : textResource3, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? null : num2, (i13 & 64) != 0 ? "" : str2, (i13 & 128) == 0 ? abstractC22403o : null, (i13 & 256) == 0 ? str3 : "", (i13 & 512) != 0 ? AbstractC27274q.a.f109136f : abstractC27274q, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? AbstractC27274q.a.f109136f : abstractC27274q2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & 4096) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f2);
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.atomic.organism.toolbar.d$a */
    @Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B±\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cB»\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0018\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010 Jº\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b+\u00105R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b3\u00109R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b:\u00109R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010AR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010B\u001a\u0004\b;\u0010CR\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b1\u0010B\u001a\u0004\b6\u0010CR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010CR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bD\u0010CR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b-\u0010G\u001a\u0004\bF\u0010HR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bI\u0010$R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bE\u0010J\u001a\u0004\b/\u0010$¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/atomic/organism/toolbar/d$a;", "Lcom/whoop/design/atomic/organism/toolbar/d;", "Lcom/whoop/design/util/TextResource;", "title", "Lo81/a;", "subtitle", "Ly71/g;", "leftIcon", "rightIcon", "Lny0/q;", "leftIconButtonType", "rightIconButtonType", "", "shouldKeepOriginalIconColor", "Lkotlin/Function0;", "Ll83/a0;", "rightIconView", "Ly81/f;", "rightIconColor", "leftIconColor", "titleColor", "subtitleColor", "Lhy0/h1;", "tag", "", "titleAutomationTag", "leftIconAutomationTag", "<init>", "(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;)V", "", "contentDescriptionLeftIcon", "contentDescriptionRightIcon", "(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;)V", "a", "(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/atomic/organism/toolbar/d$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/whoop/design/util/TextResource;", "o", "()Lcom/whoop/design/util/TextResource;", "d", "Lo81/a;", "l", "()Lo81/a;", "e", "Ly71/g;", "()Ly71/g;", "f", "g", "Lny0/q;", "()Lny0/q;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "Z", "k", "()Z", "j", "Lc93/m;", "()Lc93/m;", "Ly81/f;", "()Ly81/f;", "m", "q", "n", "Lhy0/h1;", "()Lhy0/h1;", "p", "Ljava/lang/String;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC6721d {

        /* JADX INFO: renamed from: r */
        public static final int f25641r = 8;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final TextResource title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final C27656a subtitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final C39274g leftIcon;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C39274g rightIcon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final AbstractC27274q leftIconButtonType;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final AbstractC27274q rightIconButtonType;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean shouldKeepOriginalIconColor;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        private final InterfaceC4351m rightIconView;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        private final EnumC39333f rightIconColor;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        private final EnumC39333f leftIconColor;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        private final EnumC39333f titleColor;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        private final EnumC39333f subtitleColor;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        private final C17750h1 tag;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        private final String titleAutomationTag;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        private final String leftIconAutomationTag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TextResource title, C27656a c27656a, C39274g c39274g, C39274g c39274g2, AbstractC27274q leftIconButtonType, AbstractC27274q rightIconButtonType, boolean z4, InterfaceC4351m interfaceC4351m, EnumC39333f rightIconColor, EnumC39333f leftIconColor, EnumC39333f titleColor, EnumC39333f subtitleColor, C17750h1 c17750h1, String str, String str2) {
            super(null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(leftIconButtonType, "leftIconButtonType");
            AbstractC22676k.m65750j(rightIconButtonType, "rightIconButtonType");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(leftIconColor, "leftIconColor");
            AbstractC22676k.m65750j(titleColor, "titleColor");
            AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
            this.title = title;
            this.subtitle = c27656a;
            this.leftIcon = c39274g;
            this.rightIcon = c39274g2;
            this.leftIconButtonType = leftIconButtonType;
            this.rightIconButtonType = rightIconButtonType;
            this.shouldKeepOriginalIconColor = z4;
            this.rightIconView = interfaceC4351m;
            this.rightIconColor = rightIconColor;
            this.leftIconColor = leftIconColor;
            this.titleColor = titleColor;
            this.subtitleColor = subtitleColor;
            this.tag = c17750h1;
            this.titleAutomationTag = str;
            this.leftIconAutomationTag = str2;
        }

        /* JADX INFO: renamed from: a */
        public final a m20156a(TextResource title, C27656a subtitle, C39274g leftIcon, C39274g rightIcon, AbstractC27274q leftIconButtonType, AbstractC27274q rightIconButtonType, boolean shouldKeepOriginalIconColor, InterfaceC4351m rightIconView, EnumC39333f rightIconColor, EnumC39333f leftIconColor, EnumC39333f titleColor, EnumC39333f subtitleColor, C17750h1 tag, String titleAutomationTag, String leftIconAutomationTag) {
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(leftIconButtonType, "leftIconButtonType");
            AbstractC22676k.m65750j(rightIconButtonType, "rightIconButtonType");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(leftIconColor, "leftIconColor");
            AbstractC22676k.m65750j(titleColor, "titleColor");
            AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
            return new a(title, subtitle, leftIcon, rightIcon, leftIconButtonType, rightIconButtonType, shouldKeepOriginalIconColor, rightIconView, rightIconColor, leftIconColor, titleColor, subtitleColor, tag, titleAutomationTag, leftIconAutomationTag);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final C39274g getLeftIcon() {
            return this.leftIcon;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLeftIconAutomationTag() {
            return this.leftIconAutomationTag;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final AbstractC27274q getLeftIconButtonType() {
            return this.leftIconButtonType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.title, aVar.title) && AbstractC22676k.m65745e(this.subtitle, aVar.subtitle) && AbstractC22676k.m65745e(this.leftIcon, aVar.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, aVar.rightIcon) && AbstractC22676k.m65745e(this.leftIconButtonType, aVar.leftIconButtonType) && AbstractC22676k.m65745e(this.rightIconButtonType, aVar.rightIconButtonType) && this.shouldKeepOriginalIconColor == aVar.shouldKeepOriginalIconColor && AbstractC22676k.m65745e(this.rightIconView, aVar.rightIconView) && this.rightIconColor == aVar.rightIconColor && this.leftIconColor == aVar.leftIconColor && this.titleColor == aVar.titleColor && this.subtitleColor == aVar.subtitleColor && AbstractC22676k.m65745e(this.tag, aVar.tag) && AbstractC22676k.m65745e(this.titleAutomationTag, aVar.titleAutomationTag) && AbstractC22676k.m65745e(this.leftIconAutomationTag, aVar.leftIconAutomationTag);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final EnumC39333f getLeftIconColor() {
            return this.leftIconColor;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final C39274g getRightIcon() {
            return this.rightIcon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final AbstractC27274q getRightIconButtonType() {
            return this.rightIconButtonType;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            C27656a c27656a = this.subtitle;
            int iHashCode2 = (iHashCode + (c27656a == null ? 0 : c27656a.hashCode())) * 31;
            C39274g c39274g = this.leftIcon;
            int iHashCode3 = (iHashCode2 + (c39274g == null ? 0 : c39274g.hashCode())) * 31;
            C39274g c39274g2 = this.rightIcon;
            int iM8289b = AbstractC2875y.m8289b((this.rightIconButtonType.hashCode() + ((this.leftIconButtonType.hashCode() + ((iHashCode3 + (c39274g2 == null ? 0 : c39274g2.hashCode())) * 31)) * 31)) * 31, 31, this.shouldKeepOriginalIconColor);
            InterfaceC4351m interfaceC4351m = this.rightIconView;
            int iM61132c = AbstractC21702c.m61132c(this.subtitleColor, AbstractC21702c.m61132c(this.titleColor, AbstractC21702c.m61132c(this.leftIconColor, AbstractC21702c.m61132c(this.rightIconColor, (iM8289b + (interfaceC4351m == null ? 0 : interfaceC4351m.hashCode())) * 31, 31), 31), 31), 31);
            C17750h1 c17750h1 = this.tag;
            int iHashCode4 = (iM61132c + (c17750h1 == null ? 0 : c17750h1.hashCode())) * 31;
            String str = this.titleAutomationTag;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.leftIconAutomationTag;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final EnumC39333f getRightIconColor() {
            return this.rightIconColor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final InterfaceC4351m getRightIconView() {
            return this.rightIconView;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getShouldKeepOriginalIconColor() {
            return this.shouldKeepOriginalIconColor;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final C27656a getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final EnumC39333f getSubtitleColor() {
            return this.subtitleColor;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final C17750h1 getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final TextResource getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getTitleAutomationTag() {
            return this.titleAutomationTag;
        }

        /* JADX INFO: renamed from: q, reason: from getter */
        public final EnumC39333f getTitleColor() {
            return this.titleColor;
        }

        public String toString() {
            TextResource textResource = this.title;
            C27656a c27656a = this.subtitle;
            C39274g c39274g = this.leftIcon;
            C39274g c39274g2 = this.rightIcon;
            AbstractC27274q abstractC27274q = this.leftIconButtonType;
            AbstractC27274q abstractC27274q2 = this.rightIconButtonType;
            boolean z4 = this.shouldKeepOriginalIconColor;
            InterfaceC4351m interfaceC4351m = this.rightIconView;
            EnumC39333f enumC39333f = this.rightIconColor;
            EnumC39333f enumC39333f2 = this.leftIconColor;
            EnumC39333f enumC39333f3 = this.titleColor;
            EnumC39333f enumC39333f4 = this.subtitleColor;
            C17750h1 c17750h1 = this.tag;
            String str = this.titleAutomationTag;
            String str2 = this.leftIconAutomationTag;
            StringBuilder sb4 = new StringBuilder("Center(title=");
            sb4.append(textResource);
            sb4.append(", subtitle=");
            sb4.append(c27656a);
            sb4.append(", leftIcon=");
            sb4.append(c39274g);
            sb4.append(", rightIcon=");
            sb4.append(c39274g2);
            sb4.append(", leftIconButtonType=");
            sb4.append(abstractC27274q);
            sb4.append(", rightIconButtonType=");
            sb4.append(abstractC27274q2);
            sb4.append(", shouldKeepOriginalIconColor=");
            sb4.append(z4);
            sb4.append(", rightIconView=");
            sb4.append(interfaceC4351m);
            sb4.append(", rightIconColor=");
            sb4.append(enumC39333f);
            sb4.append(", leftIconColor=");
            sb4.append(enumC39333f2);
            sb4.append(", titleColor=");
            sb4.append(enumC39333f3);
            sb4.append(", subtitleColor=");
            sb4.append(enumC39333f4);
            sb4.append(", tag=");
            sb4.append(c17750h1);
            sb4.append(", titleAutomationTag=");
            sb4.append(str);
            sb4.append(", leftIconAutomationTag=");
            return AbstractC25012a.m73376i(str2, ")", sb4);
        }

        public /* synthetic */ a(TextResource textResource, C27656a c27656a, C39274g c39274g, C39274g c39274g2, AbstractC27274q abstractC27274q, AbstractC27274q abstractC27274q2, boolean z4, InterfaceC4351m interfaceC4351m, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, C17750h1 c17750h1, String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : c27656a, (i13 & 4) != 0 ? null : c39274g, (i13 & 8) != 0 ? null : c39274g2, (i13 & 16) != 0 ? AbstractC27274q.a.f109136f : abstractC27274q, (i13 & 32) != 0 ? AbstractC27274q.a.f109136f : abstractC27274q2, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? null : interfaceC4351m, (i13 & 256) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & 512) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC39333f.WHITE_50 : enumC39333f4, (i13 & 4096) != 0 ? null : c17750h1, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str2);
        }

        public /* synthetic */ a(TextResource textResource, C27656a c27656a, Integer num, String str, Integer num2, String str2, AbstractC27274q abstractC27274q, AbstractC27274q abstractC27274q2, boolean z4, InterfaceC4351m interfaceC4351m, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, EnumC39333f enumC39333f3, EnumC39333f enumC39333f4, C17750h1 c17750h1, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? AbstractC8693b.m21267a() : textResource, (i13 & 2) != 0 ? null : c27656a, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? null : num2, (i13 & 32) == 0 ? str2 : "", (i13 & 64) != 0 ? AbstractC27274q.a.f109136f : abstractC27274q, (i13 & 128) != 0 ? AbstractC27274q.a.f109136f : abstractC27274q2, (i13 & 256) != 0 ? false : z4, (i13 & 512) != 0 ? null : interfaceC4351m, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f2, (i13 & 4096) != 0 ? EnumC39333f.BRAND_WHITE : enumC39333f3, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? EnumC39333f.WHITE_50 : enumC39333f4, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c17750h1, (i13 & 32768) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(TextResource title, C27656a c27656a, Integer num, String contentDescriptionLeftIcon, Integer num2, String contentDescriptionRightIcon, AbstractC27274q leftIconButtonType, AbstractC27274q rightIconButtonType, boolean z4, InterfaceC4351m interfaceC4351m, EnumC39333f rightIconColor, EnumC39333f leftIconColor, EnumC39333f titleColor, EnumC39333f subtitleColor, C17750h1 c17750h1, String str) {
            this(title, c27656a, num != null ? new C39274g(num.intValue(), AbstractC8693b.m21278l(contentDescriptionLeftIcon)) : null, num2 != null ? new C39274g(num2.intValue(), AbstractC8693b.m21278l(contentDescriptionRightIcon)) : null, leftIconButtonType, rightIconButtonType, z4, interfaceC4351m, rightIconColor, leftIconColor, titleColor, subtitleColor, c17750h1, str, null, DfuBaseService.ERROR_CONNECTION_MASK, null);
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(contentDescriptionLeftIcon, "contentDescriptionLeftIcon");
            AbstractC22676k.m65750j(contentDescriptionRightIcon, "contentDescriptionRightIcon");
            AbstractC22676k.m65750j(leftIconButtonType, "leftIconButtonType");
            AbstractC22676k.m65750j(rightIconButtonType, "rightIconButtonType");
            AbstractC22676k.m65750j(rightIconColor, "rightIconColor");
            AbstractC22676k.m65750j(leftIconColor, "leftIconColor");
            AbstractC22676k.m65750j(titleColor, "titleColor");
            AbstractC22676k.m65750j(subtitleColor, "subtitleColor");
        }
    }
}

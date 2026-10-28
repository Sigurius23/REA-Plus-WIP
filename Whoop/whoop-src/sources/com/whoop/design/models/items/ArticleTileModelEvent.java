package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import io.getstream.chat.android.client.api.QueryParams;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileModelEvent;", "", "<init>", "()V", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "Url", "Cta", "Image", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class ArticleTileModelEvent {
    public static final int $stable = 0;

    public /* synthetic */ ArticleTileModelEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract AnalyticEventModel getAnalyticEvent();

    private ArticleTileModelEvent() {
    }

    @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileModelEvent$Image;", "Lcom/whoop/design/models/items/ArticleTileModelEvent;", "imageUrl", "", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V", "getImageUrl", "()Ljava/lang/String;", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Image extends ArticleTileModelEvent {
        public static final int $stable = 8;
        private final AnalyticEventModel analyticEvent;
        private final String imageUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String imageUrl, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = image.imageUrl;
            }
            if ((i13 & 2) != 0) {
                analyticEventModel = image.analyticEvent;
            }
            return image.copy(str, analyticEventModel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final Image copy(String imageUrl, AnalyticEventModel analyticEvent) {
            AbstractC22676k.m65750j(imageUrl, "imageUrl");
            return new Image(imageUrl, analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return AbstractC22676k.m65745e(this.imageUrl, image.imageUrl) && AbstractC22676k.m65745e(this.analyticEvent, image.analyticEvent);
        }

        @Override // com.whoop.design.models.items.ArticleTileModelEvent
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public int hashCode() {
            int iHashCode = this.imageUrl.hashCode() * 31;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
        }

        public String toString() {
            return "Image(imageUrl=" + this.imageUrl + ", analyticEvent=" + this.analyticEvent + ")";
        }

        public /* synthetic */ Image(String str, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : analyticEventModel);
        }
    }

    @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JD\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\bHÖ\u0081\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;", "Lcom/whoop/design/models/items/ArticleTileModelEvent;", "cta", "Lcom/whoop/design/models/items/ArticleTileModelEventEnum;", "id", "", "title", "index", "", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/analytics/AnalyticEventModel;)V", "getCta", "()Lcom/whoop/design/models/items/ArticleTileModelEventEnum;", "getId", "()Ljava/lang/String;", "getTitle", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/whoop/design/models/items/ArticleTileModelEventEnum;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;", "equals", "", "other", "", "hashCode", "toString", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Cta extends ArticleTileModelEvent {
        public static final int $stable = 8;
        private final AnalyticEventModel analyticEvent;
        private final ArticleTileModelEventEnum cta;
        private final String id;
        private final Integer index;
        private final String title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cta(ArticleTileModelEventEnum cta, String id4, String title, Integer num, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            this.cta = cta;
            this.id = id4;
            this.title = title;
            this.index = num;
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ Cta copy$default(Cta cta, ArticleTileModelEventEnum articleTileModelEventEnum, String str, String str2, Integer num, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                articleTileModelEventEnum = cta.cta;
            }
            if ((i13 & 2) != 0) {
                str = cta.id;
            }
            if ((i13 & 4) != 0) {
                str2 = cta.title;
            }
            if ((i13 & 8) != 0) {
                num = cta.index;
            }
            if ((i13 & 16) != 0) {
                analyticEventModel = cta.analyticEvent;
            }
            AnalyticEventModel analyticEventModel2 = analyticEventModel;
            String str3 = str2;
            return cta.copy(articleTileModelEventEnum, str, str3, num, analyticEventModel2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ArticleTileModelEventEnum getCta() {
            return this.cta;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final Cta copy(ArticleTileModelEventEnum cta, String id4, String title, Integer index, AnalyticEventModel analyticEvent) {
            AbstractC22676k.m65750j(cta, "cta");
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(title, "title");
            return new Cta(cta, id4, title, index, analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) other;
            return this.cta == cta.cta && AbstractC22676k.m65745e(this.id, cta.id) && AbstractC22676k.m65745e(this.title, cta.title) && AbstractC22676k.m65745e(this.index, cta.index) && AbstractC22676k.m65745e(this.analyticEvent, cta.analyticEvent);
        }

        @Override // com.whoop.design.models.items.ArticleTileModelEvent
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final ArticleTileModelEventEnum getCta() {
            return this.cta;
        }

        public final String getId() {
            return this.id;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.cta.hashCode() * 31, 31, this.id), 31, this.title);
            Integer num = this.index;
            int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
        }

        public String toString() {
            ArticleTileModelEventEnum articleTileModelEventEnum = this.cta;
            String str = this.id;
            String str2 = this.title;
            Integer num = this.index;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            StringBuilder sb4 = new StringBuilder("Cta(cta=");
            sb4.append(articleTileModelEventEnum);
            sb4.append(", id=");
            sb4.append(str);
            sb4.append(", title=");
            AbstractC30007c.m91853w(num, str2, ", index=", ", analyticEvent=", sb4);
            return AbstractC38963t7.m124378h(sb4, analyticEventModel, ")");
        }

        public /* synthetic */ Cta(ArticleTileModelEventEnum articleTileModelEventEnum, String str, String str2, Integer num, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(articleTileModelEventEnum, str, str2, num, (i13 & 16) != 0 ? null : analyticEventModel);
        }
    }

    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0083\u0004J\n\u0010(\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "Lcom/whoop/design/models/items/ArticleTileModelEvent;", QueryParams.URL, "", "title", "tag", "index", "", "type", "Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "id", "analyticEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V", "getUrl", "()Ljava/lang/String;", "getTitle", "getTag", "getIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;", "getId", "getAnalyticEvent", "()Lcom/whoop/analytics/AnalyticEventModel;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "equals", "", "other", "", "hashCode", "toString", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class Url extends ArticleTileModelEvent {
        public static final int $stable = 8;
        private final AnalyticEventModel analyticEvent;
        private final String id;
        private final Integer index;
        private final String tag;
        private final String title;
        private final ArticleTileTypeDtoEnum type;
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Url(String url, String title, String str, Integer num, ArticleTileTypeDtoEnum type, String id4, AnalyticEventModel analyticEventModel) {
            super(null);
            AbstractC22676k.m65750j(url, "url");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(id4, "id");
            this.url = url;
            this.title = title;
            this.tag = str;
            this.index = num;
            this.type = type;
            this.id = id4;
            this.analyticEvent = analyticEventModel;
        }

        public static /* synthetic */ Url copy$default(Url url, String str, String str2, String str3, Integer num, ArticleTileTypeDtoEnum articleTileTypeDtoEnum, String str4, AnalyticEventModel analyticEventModel, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = url.url;
            }
            if ((i13 & 2) != 0) {
                str2 = url.title;
            }
            if ((i13 & 4) != 0) {
                str3 = url.tag;
            }
            if ((i13 & 8) != 0) {
                num = url.index;
            }
            if ((i13 & 16) != 0) {
                articleTileTypeDtoEnum = url.type;
            }
            if ((i13 & 32) != 0) {
                str4 = url.id;
            }
            if ((i13 & 64) != 0) {
                analyticEventModel = url.analyticEvent;
            }
            String str5 = str4;
            AnalyticEventModel analyticEventModel2 = analyticEventModel;
            ArticleTileTypeDtoEnum articleTileTypeDtoEnum2 = articleTileTypeDtoEnum;
            String str6 = str3;
            return url.copy(str, str2, str6, num, articleTileTypeDtoEnum2, str5, analyticEventModel2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final ArticleTileTypeDtoEnum getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final Url copy(String url, String title, String tag, Integer index, ArticleTileTypeDtoEnum type, String id4, AnalyticEventModel analyticEvent) {
            AbstractC22676k.m65750j(url, "url");
            AbstractC22676k.m65750j(title, "title");
            AbstractC22676k.m65750j(type, "type");
            AbstractC22676k.m65750j(id4, "id");
            return new Url(url, title, tag, index, type, id4, analyticEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Url)) {
                return false;
            }
            Url url = (Url) other;
            return AbstractC22676k.m65745e(this.url, url.url) && AbstractC22676k.m65745e(this.title, url.title) && AbstractC22676k.m65745e(this.tag, url.tag) && AbstractC22676k.m65745e(this.index, url.index) && this.type == url.type && AbstractC22676k.m65745e(this.id, url.id) && AbstractC22676k.m65745e(this.analyticEvent, url.analyticEvent);
        }

        @Override // com.whoop.design.models.items.ArticleTileModelEvent
        public AnalyticEventModel getAnalyticEvent() {
            return this.analyticEvent;
        }

        public final String getId() {
            return this.id;
        }

        public final Integer getIndex() {
            return this.index;
        }

        public final String getTag() {
            return this.tag;
        }

        public final String getTitle() {
            return this.title;
        }

        public final ArticleTileTypeDtoEnum getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iM30450d = AbstractC11266d.m30450d(this.url.hashCode() * 31, 31, this.title);
            String str = this.tag;
            int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.index;
            int iM30450d2 = AbstractC11266d.m30450d((this.type.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.id);
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            return iM30450d2 + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
        }

        public String toString() {
            String str = this.url;
            String str2 = this.title;
            String str3 = this.tag;
            Integer num = this.index;
            ArticleTileTypeDtoEnum articleTileTypeDtoEnum = this.type;
            String str4 = this.id;
            AnalyticEventModel analyticEventModel = this.analyticEvent;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Url(url=", str, ", title=", str2, ", tag=");
            AbstractC30007c.m91853w(num, str3, ", index=", ", type=", sbM32001t);
            sbM32001t.append(articleTileTypeDtoEnum);
            sbM32001t.append(", id=");
            sbM32001t.append(str4);
            sbM32001t.append(", analyticEvent=");
            return AbstractC38963t7.m124378h(sbM32001t, analyticEventModel, ")");
        }

        public /* synthetic */ Url(String str, String str2, String str3, Integer num, ArticleTileTypeDtoEnum articleTileTypeDtoEnum, String str4, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, num, articleTileTypeDtoEnum, str4, (i13 & 64) != 0 ? null : analyticEventModel);
        }
    }
}

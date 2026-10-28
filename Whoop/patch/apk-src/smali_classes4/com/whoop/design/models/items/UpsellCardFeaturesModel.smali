.class public final Lcom/whoop/design/models/items/UpsellCardFeaturesModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;,
        Lcom/whoop/design/models/items/UpsellCardFeaturesModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 j2\u00020\u0001:\u0002kjB\u00c7\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0016\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0016\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dB\u00d9\u0001\u0008\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008\u001c\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010$J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010$J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010$J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010$J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010$J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010$J\u0012\u0010.\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u00081\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0018\u00105\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00106J\u0010\u00107\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00087\u00108J\u0010\u00109\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u00089\u00108J\u0010\u0010:\u001a\u00020\u0016H\u00c6\u0003\u00a2\u0006\u0004\u0008:\u00108J\u0012\u0010;\u001a\u0004\u0018\u00010\u001aH\u00c6\u0003\u00a2\u0006\u0004\u0008;\u0010<J\u00f0\u0001\u0010=\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00162\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00c6\u0001\u00a2\u0006\u0004\u0008=\u0010>J\u0010\u0010?\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008?\u0010$J\u0010\u0010@\u001a\u00020\u001eH\u00d6\u0001\u00a2\u0006\u0004\u0008@\u0010AJ\u001a\u0010E\u001a\u00020D2\u0008\u0010C\u001a\u0004\u0018\u00010BH\u00d6\u0003\u00a2\u0006\u0004\u0008E\u0010FJ\'\u0010O\u001a\u00020L2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0001\u00a2\u0006\u0004\u0008M\u0010NR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010P\u001a\u0004\u0008Q\u0010$R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010P\u001a\u0004\u0008R\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010P\u001a\u0004\u0008S\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010P\u001a\u0004\u0008T\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010P\u001a\u0004\u0008U\u0010$R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010P\u001a\u0004\u0008V\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010P\u001a\u0004\u0008W\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010P\u001a\u0004\u0008X\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010P\u001a\u0004\u0008Y\u0010$R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010P\u001a\u0004\u0008Z\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010[\u001a\u0004\u0008\\\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010[\u001a\u0004\u0008]\u0010/R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010^\u001a\u0004\u0008_\u00102R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010`\u001a\u0004\u0008a\u00104R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010b\u001a\u0004\u0008c\u00106R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010d\u001a\u0004\u0008e\u00108R\u0017\u0010\u0018\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010d\u001a\u0004\u0008f\u00108R\u0017\u0010\u0019\u001a\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010d\u001a\u0004\u0008g\u00108R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010h\u001a\u0004\u0008i\u0010<\u00a8\u0006l"
    }
    d2 = {
        "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "id",
        "endIcon",
        "titleImage",
        "header",
        "title",
        "titleTypography",
        "tierImage",
        "style",
        "category",
        "trackingValue",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "cardButton",
        "secondCardButton",
        "Lcom/whoop/design/models/items/FeatureListModel;",
        "featureList",
        "Lcom/whoop/design/models/items/DescriptionCardModel;",
        "descriptionCard",
        "",
        "items",
        "",
        "sectionTopPadding",
        "sectionBottomPadding",
        "interItemPadding",
        "Lcom/whoop/design/models/items/TagModel;",
        "badge",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component12",
        "component13",
        "()Lcom/whoop/design/models/items/FeatureListModel;",
        "component14",
        "()Lcom/whoop/design/models/items/DescriptionCardModel;",
        "component15",
        "()Ljava/util/List;",
        "component16",
        "()F",
        "component17",
        "component18",
        "component19",
        "()Lcom/whoop/design/models/items/TagModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getEndIcon",
        "getTitleImage",
        "getHeader",
        "getTitle",
        "getTitleTypography",
        "getTierImage",
        "getStyle",
        "getCategory",
        "getTrackingValue",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getCardButton",
        "getSecondCardButton",
        "Lcom/whoop/design/models/items/FeatureListModel;",
        "getFeatureList",
        "Lcom/whoop/design/models/items/DescriptionCardModel;",
        "getDescriptionCard",
        "Ljava/util/List;",
        "getItems",
        "F",
        "getSectionTopPadding",
        "getSectionBottomPadding",
        "getInterItemPadding",
        "Lcom/whoop/design/models/items/TagModel;",
        "getBadge",
        "Companion",
        "$serializer",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/UpsellCardFeaturesModel$Companion;


# instance fields
.field private final badge:Lcom/whoop/design/models/items/TagModel;

.field private final cardButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final category:Ljava/lang/String;

.field private final descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

.field private final endIcon:Ljava/lang/String;

.field private final featureList:Lcom/whoop/design/models/items/FeatureListModel;

.field private final header:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final interItemPadding:F

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final sectionBottomPadding:F

.field private final sectionTopPadding:F

.field private final style:Ljava/lang/String;

.field private final tierImage:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleImage:Ljava/lang/String;

.field private final titleTypography:Ljava/lang/String;

.field private final trackingValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->Companion:Lcom/whoop/design/models/items/UpsellCardFeaturesModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/l;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lw91/l;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v3, 0x13

    new-array v3, v3, [Ll83/h;

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v1, v3, v4

    const/4 v4, 0x5

    aput-object v1, v3, v4

    const/4 v4, 0x6

    aput-object v1, v3, v4

    const/4 v4, 0x7

    aput-object v1, v3, v4

    aput-object v1, v3, v0

    const/16 v0, 0x9

    aput-object v1, v3, v0

    const/16 v0, 0xa

    aput-object v1, v3, v0

    const/16 v0, 0xb

    aput-object v1, v3, v0

    const/16 v0, 0xc

    aput-object v1, v3, v0

    const/16 v0, 0xd

    aput-object v1, v3, v0

    const/16 v0, 0xe

    aput-object v2, v3, v0

    const/16 v0, 0xf

    aput-object v1, v3, v0

    const/16 v0, 0x10

    aput-object v1, v3, v0

    const/16 v0, 0x11

    aput-object v1, v3, v0

    const/16 v0, 0x12

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0x47fff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    iput-object p11, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    iput-object p12, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p13, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    const p2, 0x8000

    and-int/2addr p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput p3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    goto :goto_0

    :cond_1
    move/from16 p2, p17

    iput p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    :goto_0
    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    iput p3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    goto :goto_1

    :cond_2
    move/from16 p2, p18

    iput p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    :goto_1
    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_3

    const/high16 p1, 0x41400000    # 12.0f

    :goto_2
    iput p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    move-object/from16 p1, p20

    goto :goto_3

    :cond_3
    move/from16 p1, p19

    goto :goto_2

    :goto_3
    iput-object p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/FeatureListModel;",
            "Lcom/whoop/design/models/items/DescriptionCardModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;FFF",
            "Lcom/whoop/design/models/items/TagModel;",
            ")V"
        }
    .end annotation

    const-string v0, "titleImage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    .line 16
    iput-object p14, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    move-object/from16 p1, p15

    .line 17
    iput-object p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    move/from16 p1, p16

    .line 18
    iput p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    move/from16 p1, p17

    .line 19
    iput p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    move/from16 p1, p18

    .line 20
    iput p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 22

    const v0, 0x8000

    and-int v0, p20, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move/from16 v18, v1

    goto :goto_0

    :cond_0
    move/from16 v18, p16

    :goto_0
    const/high16 v0, 0x10000

    and-int v0, p20, v0

    if-eqz v0, :cond_1

    move/from16 v19, v1

    goto :goto_1

    :cond_1
    move/from16 v19, p17

    :goto_1
    const/high16 v0, 0x20000

    and-int v0, p20, v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x41400000    # 12.0f

    move/from16 v20, v0

    :goto_2
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move-object/from16 v14, p12

    move-object/from16 v15, p13

    move-object/from16 v16, p14

    move-object/from16 v17, p15

    move-object/from16 v21, p19

    goto :goto_3

    :cond_2
    move/from16 v20, p18

    goto :goto_2

    .line 22
    :goto_3
    invoke-direct/range {v2 .. v21}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p20

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget v1, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    goto :goto_f

    :cond_f
    move/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p20, v16

    move/from16 p2, v1

    if-eqz v16, :cond_10

    iget v1, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p20, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget v1, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p20, v16

    if-eqz v16, :cond_12

    move/from16 p4, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    move/from16 p19, p4

    move-object/from16 p20, v1

    :goto_12
    move/from16 p17, p2

    move/from16 p18, p3

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_13

    :cond_12
    move-object/from16 p20, p19

    move/from16 p19, v1

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p20}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/UpsellCardFeaturesModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/16 v3, 0xa

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0xb

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/FeatureListModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FeatureListModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    const/16 v3, 0xc

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DescriptionCardModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    const/16 v3, 0xd

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v1, 0xe

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_1

    :goto_0
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_1
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    :goto_1
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_3
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    const/high16 v2, 0x41400000    # 12.0f

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_5

    :goto_2
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_5
    sget-object v0, Lcom/whoop/design/models/items/TagModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/TagModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    const/16 v1, 0x12

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/items/FeatureListModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    return-object v0
.end method

.method public final component14()Lcom/whoop/design/models/items/DescriptionCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    return-object v0
.end method

.method public final component15()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component16()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    return v0
.end method

.method public final component17()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    return v0
.end method

.method public final component18()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    return v0
.end method

.method public final component19()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)Lcom/whoop/design/models/items/UpsellCardFeaturesModel;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/CardButtonModel;",
            "Lcom/whoop/design/models/items/FeatureListModel;",
            "Lcom/whoop/design/models/items/DescriptionCardModel;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;FFF",
            "Lcom/whoop/design/models/items/TagModel;",
            ")",
            "Lcom/whoop/design/models/items/UpsellCardFeaturesModel;"
        }
    .end annotation

    const-string v0, "titleImage"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    invoke-direct/range {v1 .. v20}, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/design/models/items/FeatureListModel;Lcom/whoop/design/models/items/DescriptionCardModel;Ljava/util/List;FFFLcom/whoop/design/models/items/TagModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    iget v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    iget v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_12

    return v2

    :cond_12
    iget v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    iget v3, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getBadge()Lcom/whoop/design/models/items/TagModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    return-object v0
.end method

.method public final getCardButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescriptionCard()Lcom/whoop/design/models/items/DescriptionCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getFeatureList()Lcom/whoop/design/models/items/FeatureListModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    return-object v0
.end method

.method public final getHeader()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getInterItemPadding()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    return v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getSecondCardButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getSectionBottomPadding()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    return v0
.end method

.method public final getSectionTopPadding()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    return v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getTierImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleImage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleTypography()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrackingValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Lcom/whoop/design/models/items/FeatureListModel;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Lcom/whoop/design/models/items/DescriptionCardModel;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    if-nez v3, :cond_c

    move v3, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget v3, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    invoke-static {v3, v0, v2}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    if-nez v2, :cond_d

    goto :goto_d

    :cond_d
    invoke-virtual {v2}, Lcom/whoop/design/models/items/TagModel;->hashCode()I

    move-result v1

    :goto_d
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->id:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->endIcon:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleImage:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->header:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->title:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->titleTypography:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->tierImage:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->style:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->category:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->trackingValue:Ljava/lang/String;

    iget-object v11, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->cardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v12, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->secondCardButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v13, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->featureList:Lcom/whoop/design/models/items/FeatureListModel;

    iget-object v14, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->descriptionCard:Lcom/whoop/design/models/items/DescriptionCardModel;

    iget-object v15, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->items:Ljava/util/List;

    move-object/from16 v16, v15

    iget v15, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionTopPadding:F

    move/from16 v17, v15

    iget v15, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->sectionBottomPadding:F

    move/from16 v18, v15

    iget v15, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->interItemPadding:F

    move/from16 v19, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/UpsellCardFeaturesModel;->badge:Lcom/whoop/design/models/items/TagModel;

    const-string v0, ", endIcon="

    move-object/from16 v20, v15

    const-string v15, ", titleImage="

    move-object/from16 v21, v14

    const-string v14, "UpsellCardFeaturesModel(id="

    invoke-static {v14, v1, v0, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", header="

    const-string v2, ", title="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", titleTypography="

    const-string v2, ", tierImage="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", style="

    const-string v2, ", category="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trackingValue="

    const-string v2, ", cardButton="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondCardButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", featureList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", descriptionCard="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", items="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sectionTopPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", sectionBottomPadding="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", interItemPadding="

    const-string v2, ", badge="

    move/from16 v3, v18

    move/from16 v4, v19

    invoke-static {v0, v3, v1, v4, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

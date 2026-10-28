.class public final Lcom/whoop/design/models/items/CollapsableHeaderModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/CollapsableHeaderModel$$serializer;,
        Lcom/whoop/design/models/items/CollapsableHeaderModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9BU\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rB_\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J^\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008)\u0010*J\u001a\u0010-\u001a\u00020\u00052\u0008\u0010,\u001a\u0004\u0018\u00010+H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010/\u001a\u0004\u00081\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010/\u001a\u0004\u00084\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010/\u001a\u0004\u00085\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00106\u001a\u0004\u00087\u0010$R\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00106\u001a\u0004\u00088\u0010$\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CollapsableHeaderModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "subtitle",
        "",
        "subtitleStickOnScroll",
        "subtitleTypography",
        "backgroundUrl",
        "Lcom/whoop/design/models/items/HeaderIconConfig;",
        "endNavigationButton",
        "startNavigationButton",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/HeaderIconConfig;",
        "component7",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)Lcom/whoop/design/models/items/CollapsableHeaderModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "Z",
        "getSubtitleStickOnScroll",
        "getSubtitleTypography",
        "getBackgroundUrl",
        "Lcom/whoop/design/models/items/HeaderIconConfig;",
        "getEndNavigationButton",
        "getStartNavigationButton",
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/CollapsableHeaderModel$Companion;


# instance fields
.field private final backgroundUrl:Ljava/lang/String;

.field private final endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

.field private final startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

.field private final subtitle:Ljava/lang/String;

.field private final subtitleStickOnScroll:Z

.field private final subtitleTypography:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/CollapsableHeaderModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/CollapsableHeaderModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->Companion:Lcom/whoop/design/models/items/CollapsableHeaderModel$Companion;

    sget v0, Lcom/whoop/navigation/models/GenericInteraction;->$stable:I

    sput v0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 10

    .line 1
    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/CollapsableHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    if-nez p9, :cond_0

    .line 3
    const-string p2, ""

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p9, 0x0

    if-nez p2, :cond_1

    iput-object p9, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    goto :goto_1

    :cond_2
    iput-boolean p4, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p9, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p9, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p9, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    :goto_4
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    .line 5
    new-instance p1, Lcom/whoop/design/models/items/HeaderIconConfig;

    const/4 p2, 0x3

    invoke-direct {p1, p9, p9, p2, p9}, Lcom/whoop/design/models/items/HeaderIconConfig;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-void

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startNavigationButton"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    .line 10
    iput-boolean p3, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    .line 11
    iput-object p4, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    .line 12
    iput-object p5, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    .line 13
    iput-object p6, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    .line 14
    iput-object p7, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    .line 15
    const-string p1, ""

    :cond_0
    and-int/lit8 p9, p8, 0x2

    const/4 v0, 0x0

    if-eqz p9, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    const/4 p3, 0x0

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    .line 16
    new-instance p7, Lcom/whoop/design/models/items/HeaderIconConfig;

    const/4 p8, 0x3

    invoke-direct {p7, v0, v0, p8, v0}, Lcom/whoop/design/models/items/HeaderIconConfig;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 17
    invoke-direct/range {p2 .. p9}, Lcom/whoop/design/models/items/CollapsableHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/CollapsableHeaderModel;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;ILjava/lang/Object;)Lcom/whoop/design/models/items/CollapsableHeaderModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/CollapsableHeaderModel;->copy(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)Lcom/whoop/design/models/items/CollapsableHeaderModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/CollapsableHeaderModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    const-string v2, ""

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    if-eqz v1, :cond_5

    :goto_2
    iget-boolean v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/design/models/items/HeaderIconConfig$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HeaderIconConfig$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    new-instance v3, Lcom/whoop/design/models/items/HeaderIconConfig;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v4, v0, v4}, Lcom/whoop/design/models/items/HeaderIconConfig;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :goto_6
    sget-object v0, Lcom/whoop/design/models/items/HeaderIconConfig$$serializer;->INSTANCE:Lcom/whoop/design/models/items/HeaderIconConfig$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/HeaderIconConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/HeaderIconConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)Lcom/whoop/design/models/items/CollapsableHeaderModel;
    .locals 9

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startNavigationButton"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/CollapsableHeaderModel;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/CollapsableHeaderModel;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HeaderIconConfig;Lcom/whoop/design/models/items/HeaderIconConfig;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    iget-object v3, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    iget-object p1, p1, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBackgroundUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getEndNavigationButton()Lcom/whoop/design/models/items/HeaderIconConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-object v0
.end method

.method public final getStartNavigationButton()Lcom/whoop/design/models/items/HeaderIconConfig;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitleStickOnScroll()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    return v0
.end method

.method public final getSubtitleTypography()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/HeaderIconConfig;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HeaderIconConfig;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitle:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleStickOnScroll:Z

    iget-object v3, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->subtitleTypography:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->backgroundUrl:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->endNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    iget-object v6, p0, Lcom/whoop/design/models/items/CollapsableHeaderModel;->startNavigationButton:Lcom/whoop/design/models/items/HeaderIconConfig;

    const-string v7, ", subtitle="

    const-string v8, ", subtitleStickOnScroll="

    const-string v9, "CollapsableHeaderModel(title="

    invoke-static {v9, v0, v7, v1, v8}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitleTypography="

    const-string v7, ", backgroundUrl="

    invoke-static {v0, v2, v1, v3, v7}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endNavigationButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startNavigationButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

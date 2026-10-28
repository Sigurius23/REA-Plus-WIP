.class public final Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$$serializer;,
        Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@Bg\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBq\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0016\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)Jp\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010.J\u001a\u00102\u001a\u0002012\u0008\u00100\u001a\u0004\u0018\u00010/H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00104\u001a\u0004\u00085\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00104\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00104\u001a\u0004\u00087\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u00089\u0010#R\u001d\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010:\u001a\u0004\u0008;\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u0008<\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u0008=\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008?\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "titleIcon",
        "subtitle",
        "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
        "smallButton",
        "",
        "largeButtons",
        "imageUrl",
        "bottomNavText",
        "Lcom/whoop/navigation/e;",
        "bottomNavDestination",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
        "component5",
        "()Ljava/util/List;",
        "component6",
        "component7",
        "component8",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getTitleIcon",
        "getSubtitle",
        "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
        "getSmallButton",
        "Ljava/util/List;",
        "getLargeButtons",
        "getImageUrl",
        "getBottomNavText",
        "Lcom/whoop/navigation/e;",
        "getBottomNavDestination",
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

.field public static final Companion:Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$Companion;


# instance fields
.field private final bottomNavDestination:Lcom/whoop/navigation/e;

.field private final bottomNavText:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final largeButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            ">;"
        }
    .end annotation
.end field

.field private final smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final titleIcon:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->Companion:Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw70/a;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lw70/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw70/a;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lw70/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v4, 0x1

    aput-object v1, v0, v4

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const/4 v4, 0x3

    aput-object v1, v0, v4

    const/4 v4, 0x4

    aput-object v3, v0, v4

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v1, v0, v3

    const/4 v1, 0x7

    aput-object v2, v0, v1

    sput-object v0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const-string v0, ""

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    const/4 p10, 0x0

    if-nez p2, :cond_1

    iput-object p10, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p10, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p10, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p10, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p10, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "largeButtons"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    .line 13
    iput-object p8, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p10, p9, 0x1

    .line 14
    const-string v0, ""

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    const/4 v1, 0x0

    if-eqz p10, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    .line 15
    sget-object p5, Lm83/y;->w:Lm83/y;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v1

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v1

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p9, v1

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p9, p8

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    if-eqz v2, :cond_d

    :goto_6
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/navigation/e;",
            ")",
            "Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "largeButtons"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBottomNavDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getBottomNavText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    return-object v0
.end method

.method public final getImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getLargeButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    return-object v0
.end method

.method public final getSmallButton()Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->titleIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->smallButton:Lcom/whoop/design/models/items/AiChatTalkTextButtonModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->largeButtons:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->imageUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavText:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/design/models/items/AiChatTalkTextEmptyStateModel;->bottomNavDestination:Lcom/whoop/navigation/e;

    const-string v8, ", titleIcon="

    const-string v9, ", subtitle="

    const-string v10, "AiChatTalkTextEmptyStateModel(title="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", smallButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", largeButtons="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    const-string v2, ", bottomNavText="

    invoke-static {v1, v5, v2, v0, v4}, Lhc3/i;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", bottomNavDestination="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

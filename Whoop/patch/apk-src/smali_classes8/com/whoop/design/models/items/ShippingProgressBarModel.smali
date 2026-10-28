.class public final Lcom/whoop/design/models/items/ShippingProgressBarModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ShippingProgressBarModel$$serializer;,
        Lcom/whoop/design/models/items/ShippingProgressBarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 <2\u00020\u0001:\u0002=<BQ\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eB]\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\r\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JZ\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020\u000b2\u0008\u0010.\u001a\u0004\u0018\u00010-H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u00084\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00101\u001a\u0004\u00085\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00101\u001a\u0004\u00086\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00107\u001a\u0004\u00088\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00107\u001a\u0004\u00089\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010:\u001a\u0004\u0008;\u0010\'\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ShippingProgressBarModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "titleDisplay",
        "",
        "progressPercentage",
        "leadingSubtext",
        "trailingSubtext",
        "Lgz0/m0;",
        "icon",
        "leadingIcon",
        "",
        "hideProgressBar",
        "<init>",
        "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ShippingProgressBarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()D",
        "component3",
        "component4",
        "component5",
        "()Lgz0/m0;",
        "component6",
        "component7",
        "()Z",
        "copy",
        "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)Lcom/whoop/design/models/items/ShippingProgressBarModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitleDisplay",
        "D",
        "getProgressPercentage",
        "getLeadingSubtext",
        "getTrailingSubtext",
        "Lgz0/m0;",
        "getIcon",
        "getLeadingIcon",
        "Z",
        "getHideProgressBar",
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

.field public static final Companion:Lcom/whoop/design/models/items/ShippingProgressBarModel$Companion;


# instance fields
.field private final hideProgressBar:Z

.field private final icon:Lgz0/m0;

.field private final leadingIcon:Lgz0/m0;

.field private final leadingSubtext:Ljava/lang/String;

.field private final progressPercentage:D

.field private final titleDisplay:Ljava/lang/String;

.field private final trailingSubtext:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/design/models/items/ShippingProgressBarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ShippingProgressBarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->Companion:Lcom/whoop/design/models/items/ShippingProgressBarModel$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lw91/j;

    const/16 v3, 0xd

    invoke-direct {v2, v3}, Lw91/j;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lw91/j;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Lw91/j;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x7

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v1, v3, v4

    const/4 v4, 0x2

    aput-object v1, v3, v4

    const/4 v4, 0x3

    aput-object v1, v3, v4

    const/4 v4, 0x4

    aput-object v2, v3, v4

    const/4 v2, 0x5

    aput-object v0, v3, v2

    const/4 v0, 0x6

    aput-object v1, v3, v0

    sput-object v3, Lcom/whoop/design/models/items/ShippingProgressBarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/items/ShippingProgressBarModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const-string v0, ""

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    const-wide/16 p2, 0x0

    iput-wide p2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    goto :goto_1

    :cond_1
    iput-wide p3, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p5, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    goto :goto_3

    :cond_3
    iput-object p6, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    goto :goto_4

    :cond_4
    iput-object p7, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    goto :goto_5

    :cond_5
    iput-object p8, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    :goto_5
    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_6

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    return-void

    :cond_6
    iput-boolean p9, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V
    .locals 1

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingSubtext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingSubtext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    .line 5
    iput-wide p2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    .line 10
    iput-boolean p8, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    .line 11
    const-string v0, ""

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p10, p9, 0x10

    const/4 v0, 0x0

    if-eqz p10, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    const/4 p8, 0x0

    :cond_6
    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-wide p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/items/ShippingProgressBarModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.atom.icon.WhoopIconMapper"

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ShippingProgressBarModel;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZILjava/lang/Object;)Lcom/whoop/design/models/items/ShippingProgressBarModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-wide p2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p4, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p5, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p6, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p7, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    :cond_5
    and-int/lit8 p9, p9, 0x40

    if-eqz p9, :cond_6

    iget-boolean p8, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    :cond_6
    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p6, p4

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/ShippingProgressBarModel;->copy(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)Lcom/whoop/design/models/items/ShippingProgressBarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ShippingProgressBarModel;Lzc3/c;Lyc3/g;)V
    .locals 8

    sget-object v0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v4, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    const-wide/16 v6, 0x0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Double;->compare(DD)I

    move-result v2

    if-eqz v2, :cond_3

    :goto_1
    iget-wide v4, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    invoke-interface {p1, p2, v1, v4, v5}, Lzc3/c;->encodeDoubleElement(Lyc3/g;ID)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    if-eqz v1, :cond_d

    :goto_6
    iget-boolean p0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component6()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)Lcom/whoop/design/models/items/ShippingProgressBarModel;
    .locals 10

    const-string v0, "titleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leadingSubtext"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trailingSubtext"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ShippingProgressBarModel;

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/ShippingProgressBarModel;-><init>(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    iget-wide v5, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    iget-boolean p1, p1, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getHideProgressBar()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    return v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getLeadingIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    return-object v0
.end method

.method public final getLeadingSubtext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public final getProgressPercentage()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    return-wide v0
.end method

.method public final getTitleDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingSubtext()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->titleDisplay:Ljava/lang/String;

    iget-wide v1, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->progressPercentage:D

    iget-object v3, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingSubtext:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->trailingSubtext:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->icon:Lgz0/m0;

    iget-object v6, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->leadingIcon:Lgz0/m0;

    iget-boolean v7, p0, Lcom/whoop/design/models/items/ShippingProgressBarModel;->hideProgressBar:Z

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "ShippingProgressBarModel(titleDisplay="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", progressPercentage="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", leadingSubtext="

    const-string v1, ", trailingSubtext="

    invoke-static {v8, v0, v3, v1, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ", icon="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", leadingIcon="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", hideProgressBar="

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

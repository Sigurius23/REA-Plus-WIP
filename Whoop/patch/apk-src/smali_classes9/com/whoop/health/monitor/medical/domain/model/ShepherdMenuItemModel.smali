.class public final Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$$serializer;,
        Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0081\u0008\u0018\u0000 C2\u00020\u0001:\u0002DCBo\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010B\u007f\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u0019J\u0010\u0010\u001e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"Jx\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010\u0019J\u0010\u0010&\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u001a\u0010+\u001a\u00020*2\u0008\u0010)\u001a\u0004\u0018\u00010(H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001\u00a2\u0006\u0004\u00083\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00106\u001a\u0004\u00087\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00108\u001a\u0004\u00089\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00108\u001a\u0004\u0008:\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00108\u001a\u0004\u0008;\u0010\u0019R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00108\u001a\u0004\u0008<\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00108\u001a\u0004\u0008=\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00108\u001a\u0004\u0008>\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00108\u001a\u0004\u0008?\u0010\u0019R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u00108\u001a\u0004\u0008@\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010A\u001a\u0004\u0008B\u0010\"\u00a8\u0006E"
    }
    d2 = {
        "Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "",
        "subtitle",
        "suffixTitle",
        "suffixSubtitle",
        "suffixType",
        "leftIcon",
        "rightIcon",
        "menuItemState",
        "style",
        "Lcom/whoop/navigation/e;",
        "destination",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/navigation/e;",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;",
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
        "write$Self$kennel_release",
        "(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getTitle",
        "Ljava/lang/String;",
        "getSubtitle",
        "getSuffixTitle",
        "getSuffixSubtitle",
        "getSuffixType",
        "getLeftIcon",
        "getRightIcon",
        "getMenuItemState",
        "getStyle",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Companion",
        "$serializer",
        "kennel_release"
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

.field public static final Companion:Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$Companion;


# instance fields
.field private final destination:Lcom/whoop/navigation/e;

.field private final leftIcon:Ljava/lang/String;

.field private final menuItemState:Ljava/lang/String;

.field private final rightIcon:Ljava/lang/String;

.field private final style:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final suffixSubtitle:Ljava/lang/String;

.field private final suffixTitle:Ljava/lang/String;

.field private final suffixType:Ljava/lang/String;

.field private final title:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->Companion:Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lwi0/d;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lwi0/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0xa

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v1, v2, v3

    const/4 v3, 0x7

    aput-object v1, v2, v3

    const/16 v3, 0x8

    aput-object v1, v2, v3

    const/16 v1, 0x9

    aput-object v0, v2, v1

    sput-object v2, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 13

    .line 1
    const/16 v11, 0x3ff

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v12}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p12, p1, 0x1

    if-nez p12, :cond_0

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 4
    :cond_0
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    and-int/lit8 p2, p1, 0x2

    const/4 p12, 0x0

    if-nez p2, :cond_1

    iput-object p12, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    const-string p3, ""

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    :goto_7
    and-int/lit16 p1, p1, 0x200

    if-nez p1, :cond_9

    iput-object p12, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    return-void

    :cond_9
    iput-object p11, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffixTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffixSubtitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffixType"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftIcon"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightIcon"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menuItemState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    .line 11
    iput-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    .line 12
    iput-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    .line 13
    iput-object p8, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    .line 14
    iput-object p9, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    .line 15
    iput-object p10, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 2

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    .line 16
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :cond_0
    and-int/lit8 p12, p11, 0x2

    const/4 v0, 0x0

    if-eqz p12, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p12, p11, 0x4

    .line 17
    const-string v1, ""

    if-eqz p12, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    move-object p4, v1

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    move-object p5, v1

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    move-object p6, v1

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    move-object p7, v1

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    move-object p8, v1

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    move-object p9, v1

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    move-object p12, v0

    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    goto :goto_0

    :cond_9
    move-object p12, p10

    move-object p11, p9

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    :goto_0
    invoke-direct/range {p2 .. p12}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ILjava/lang/Object;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    :cond_9
    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$kennel_release(Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    sget-object v2, Lmd1/a;->a:Lmd1/a;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :goto_5
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :goto_6
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_d
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :goto_7
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_f
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_8

    :cond_10
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :goto_8
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_11
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_12

    goto :goto_9

    :cond_12
    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_13

    :goto_9
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_13
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;
    .locals 12

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffixTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffixSubtitle"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "suffixType"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "leftIcon"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rightIcon"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "menuItemState"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    iget-object p1, p1, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getMenuItemState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    return-object v0
.end method

.method public final getRightIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffixSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffixTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSuffixType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->title:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixTitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixSubtitle:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->suffixType:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->leftIcon:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->rightIcon:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->menuItemState:Ljava/lang/String;

    iget-object v8, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->style:Ljava/lang/String;

    iget-object v9, p0, Lcom/whoop/health/monitor/medical/domain/model/ShepherdMenuItemModel;->destination:Lcom/whoop/navigation/e;

    const-string v10, ", subtitle="

    const-string v11, ", suffixTitle="

    const-string v12, "ShepherdMenuItemModel(title="

    invoke-static {v12, v0, v10, v1, v11}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", suffixSubtitle="

    const-string v10, ", suffixType="

    invoke-static {v0, v2, v1, v3, v10}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", leftIcon="

    const-string v2, ", rightIcon="

    invoke-static {v0, v4, v1, v5, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", menuItemState="

    const-string v2, ", style="

    invoke-static {v0, v6, v1, v7, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", destination="

    const-string v2, ")"

    invoke-static {v0, v8, v1, v9, v2}, Lev/n;->j(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

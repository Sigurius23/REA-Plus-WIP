.class public final Lcom/whoop/design/models/items/NavigationBarModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/NavigationBarModel$$serializer;,
        Lcom/whoop/design/models/items/NavigationBarModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBy\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013B{\u0008\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001aJ\u0082\u0001\u0010(\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0008\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u001a\u0010/\u001a\u00020.2\u0008\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100J\'\u00109\u001a\u0002062\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001\u00a2\u0006\u0004\u00087\u00108R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008<\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008>\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008@\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010?\u001a\u0004\u0008A\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008C\u0010\"R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010D\u001a\u0004\u0008E\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010F\u001a\u0004\u0008G\u0010&R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010:\u001a\u0004\u0008H\u0010\u001a\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/design/models/items/NavigationBarModel;",
        "",
        "",
        "title",
        "subtitle",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/design/models/items/NavigationButtonModel;",
        "leftButton",
        "rightButton",
        "Lcom/whoop/design/models/items/NavigationBarStyle;",
        "style",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "fixedHeader",
        "Lcom/whoop/design/models/items/NavigationBarFixedHeader;",
        "header",
        "tag",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lgz0/m0;",
        "component4",
        "()Lcom/whoop/design/models/items/NavigationButtonModel;",
        "component5",
        "component6",
        "()Lcom/whoop/design/models/items/NavigationBarStyle;",
        "component7",
        "()Ljava/util/List;",
        "component8",
        "()Lcom/whoop/design/models/items/NavigationBarFixedHeader;",
        "component9",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)Lcom/whoop/design/models/items/NavigationBarModel;",
        "toString",
        "hashCode",
        "()I",
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
        "(Lcom/whoop/design/models/items/NavigationBarModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "Lgz0/m0;",
        "getIcon",
        "Lcom/whoop/design/models/items/NavigationButtonModel;",
        "getLeftButton",
        "getRightButton",
        "Lcom/whoop/design/models/items/NavigationBarStyle;",
        "getStyle",
        "Ljava/util/List;",
        "getFixedHeader",
        "Lcom/whoop/design/models/items/NavigationBarFixedHeader;",
        "getHeader",
        "getTag",
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

.field public static final Companion:Lcom/whoop/design/models/items/NavigationBarModel$Companion;


# instance fields
.field private final fixedHeader:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

.field private final icon:Lgz0/m0;

.field private final leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

.field private final rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

.field private final style:Lcom/whoop/design/models/items/NavigationBarStyle;

.field private final subtitle:Ljava/lang/String;

.field private final tag:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/whoop/design/models/items/NavigationBarModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/NavigationBarModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/NavigationBarModel;->Companion:Lcom/whoop/design/models/items/NavigationBarModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/NavigationBarModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/h;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lw91/h;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lw91/h;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lw91/h;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v7, Lw91/h;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lw91/h;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v7, 0x9

    new-array v7, v7, [Ll83/h;

    aput-object v1, v7, v4

    aput-object v1, v7, v6

    aput-object v3, v7, v8

    const/4 v3, 0x3

    aput-object v1, v7, v3

    const/4 v3, 0x4

    aput-object v1, v7, v3

    const/4 v3, 0x5

    aput-object v5, v7, v3

    const/4 v3, 0x6

    aput-object v2, v7, v3

    const/4 v2, 0x7

    aput-object v1, v7, v2

    aput-object v1, v7, v0

    sput-object v7, Lcom/whoop/design/models/items/NavigationBarModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/design/models/items/NavigationBarModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p11, p1, 0x1

    const/4 v0, 0x0

    if-nez p11, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    :goto_6
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    goto :goto_7

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    :goto_7
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lcom/whoop/design/models/items/NavigationButtonModel;",
            "Lcom/whoop/design/models/items/NavigationButtonModel;",
            "Lcom/whoop/design/models/items/NavigationBarStyle;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/NavigationBarFixedHeader;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    .line 6
    iput-object p3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    .line 7
    iput-object p4, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    .line 8
    iput-object p5, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    .line 9
    iput-object p6, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    .line 10
    iput-object p7, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    .line 11
    iput-object p8, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    .line 12
    iput-object p9, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move-object p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    move-object p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move-object p10, v0

    :goto_0
    move-object p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move-object p10, p9

    goto :goto_0

    .line 13
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/design/models/items/NavigationBarModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)V

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
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/NavigationBarStyle;->Companion:Lcom/whoop/design/models/items/NavigationBarStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/NavigationBarStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
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

    invoke-static {}, Lcom/whoop/design/models/items/NavigationBarModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/NavigationBarModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NavigationBarModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/NavigationBarModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/NavigationBarModel;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    :cond_8
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

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/design/models/items/NavigationBarModel;->copy(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)Lcom/whoop/design/models/items/NavigationBarModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/NavigationBarModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/NavigationBarModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    if-eqz v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationButtonModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    if-eqz v2, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/items/NavigationBarFixedHeader$$serializer;->INSTANCE:Lcom/whoop/design/models/items/NavigationBarFixedHeader$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    if-eqz v1, :cond_11

    :goto_8
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/NavigationButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/NavigationButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/NavigationBarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/NavigationBarFixedHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)Lcom/whoop/design/models/items/NavigationBarModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Lcom/whoop/design/models/items/NavigationButtonModel;",
            "Lcom/whoop/design/models/items/NavigationButtonModel;",
            "Lcom/whoop/design/models/items/NavigationBarStyle;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/design/models/items/NavigationBarFixedHeader;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/design/models/items/NavigationBarModel;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/design/models/items/NavigationBarModel;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/whoop/design/models/items/NavigationBarModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationButtonModel;Lcom/whoop/design/models/items/NavigationBarStyle;Ljava/util/List;Lcom/whoop/design/models/items/NavigationBarFixedHeader;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/NavigationBarModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/NavigationBarModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    iget-object v3, p1, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getFixedHeader()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    return-object v0
.end method

.method public final getHeader()Lcom/whoop/design/models/items/NavigationBarFixedHeader;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    return-object v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getLeftButton()Lcom/whoop/design/models/items/NavigationButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    return-object v0
.end method

.method public final getRightButton()Lcom/whoop/design/models/items/NavigationButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/design/models/items/NavigationBarStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NavigationButtonModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NavigationButtonModel;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    if-nez v2, :cond_5

    move v2, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    if-nez v2, :cond_6

    move v2, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    if-nez v2, :cond_7

    move v2, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/design/models/items/NavigationBarFixedHeader;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    if-nez v2, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_8
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/design/models/items/NavigationBarModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/NavigationBarModel;->subtitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/NavigationBarModel;->icon:Lgz0/m0;

    iget-object v3, p0, Lcom/whoop/design/models/items/NavigationBarModel;->leftButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    iget-object v4, p0, Lcom/whoop/design/models/items/NavigationBarModel;->rightButton:Lcom/whoop/design/models/items/NavigationButtonModel;

    iget-object v5, p0, Lcom/whoop/design/models/items/NavigationBarModel;->style:Lcom/whoop/design/models/items/NavigationBarStyle;

    iget-object v6, p0, Lcom/whoop/design/models/items/NavigationBarModel;->fixedHeader:Ljava/util/List;

    iget-object v7, p0, Lcom/whoop/design/models/items/NavigationBarModel;->header:Lcom/whoop/design/models/items/NavigationBarFixedHeader;

    iget-object v8, p0, Lcom/whoop/design/models/items/NavigationBarModel;->tag:Ljava/lang/String;

    const-string v9, ", subtitle="

    const-string v10, ", icon="

    const-string v11, "NavigationBarModel(title="

    invoke-static {v11, v0, v9, v1, v10}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", leftButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rightButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fixedHeader="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", header="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

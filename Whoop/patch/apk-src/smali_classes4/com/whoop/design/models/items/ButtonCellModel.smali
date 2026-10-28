.class public final Lcom/whoop/design/models/items/ButtonCellModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/ButtonCellModel$$serializer;,
        Lcom/whoop/design/models/items/ButtonCellModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u0000 T2\u00020\u0001:\u0002UTB\u00a3\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u00a1\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u00ae\u0001\u0010/\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u0010\u00101\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00081\u0010\u001dJ\u0010\u00102\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00082\u00103J\u001a\u00106\u001a\u00020\u000f2\u0008\u00105\u001a\u0004\u0018\u000104H\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107J\'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001\u00a2\u0006\u0004\u0008>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010A\u001a\u0004\u0008B\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010A\u001a\u0004\u0008C\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010A\u001a\u0004\u0008D\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010A\u001a\u0004\u0008E\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010A\u001a\u0004\u0008F\u0010\u001dR\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010A\u001a\u0004\u0008G\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010A\u001a\u0004\u0008H\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008I\u0010\u001dR\u001f\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010J\u001a\u0004\u0008K\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010L\u001a\u0004\u0008M\u0010(R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010N\u001a\u0004\u0008O\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010P\u001a\u0004\u0008Q\u0010,R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010R\u001a\u0004\u0008S\u0010.\u00a8\u0006V"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ButtonCellModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "subtitle",
        "titleType",
        "leadingIcon",
        "leadingImageUrl",
        "trailingIcon",
        "message",
        "style",
        "",
        "avatars",
        "Ly81/f;",
        "tintColor",
        "",
        "enabled",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "modal",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
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
        "()Ljava/util/List;",
        "component10",
        "()Ly81/f;",
        "component11",
        "()Z",
        "component12",
        "()Lcom/whoop/navigation/e;",
        "component13",
        "()Lcom/whoop/design/models/modal/AnyModal;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/items/ButtonCellModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/ButtonCellModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getTitle",
        "getSubtitle",
        "getTitleType",
        "getLeadingIcon",
        "getLeadingImageUrl",
        "getTrailingIcon",
        "getMessage",
        "getStyle",
        "Ljava/util/List;",
        "getAvatars",
        "Ly81/f;",
        "getTintColor",
        "Z",
        "getEnabled",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Lcom/whoop/design/models/modal/AnyModal;",
        "getModal",
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

.field public static final Companion:Lcom/whoop/design/models/items/ButtonCellModel$Companion;


# instance fields
.field private final avatars:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final destination:Lcom/whoop/navigation/e;

.field private final enabled:Z

.field private final leadingIcon:Ljava/lang/String;

.field private final leadingImageUrl:Ljava/lang/String;

.field private final message:Ljava/lang/String;

.field private final modal:Lcom/whoop/design/models/modal/AnyModal;

.field private final style:Ljava/lang/String;

.field private final subtitle:Ljava/lang/String;

.field private final tintColor:Ly81/f;

.field private final title:Ljava/lang/String;

.field private final titleType:Ljava/lang/String;

.field private final trailingIcon:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/whoop/design/models/items/ButtonCellModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/ButtonCellModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/ButtonCellModel;->Companion:Lcom/whoop/design/models/items/ButtonCellModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/ButtonCellModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lw91/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/a;

    const/16 v5, 0x13

    invoke-direct {v4, v5}, Lw91/a;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/a;

    const/16 v6, 0x14

    invoke-direct {v5, v6}, Lw91/a;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lw91/a;

    const/16 v7, 0x15

    invoke-direct {v6, v7}, Lw91/a;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v6, 0xd

    new-array v6, v6, [Ll83/h;

    const/4 v7, 0x0

    aput-object v1, v6, v7

    const/4 v7, 0x1

    aput-object v1, v6, v7

    const/4 v7, 0x2

    aput-object v1, v6, v7

    const/4 v7, 0x3

    aput-object v1, v6, v7

    const/4 v7, 0x4

    aput-object v1, v6, v7

    const/4 v7, 0x5

    aput-object v1, v6, v7

    const/4 v7, 0x6

    aput-object v1, v6, v7

    const/4 v7, 0x7

    aput-object v1, v6, v7

    aput-object v3, v6, v0

    const/16 v0, 0x9

    aput-object v4, v6, v0

    const/16 v0, 0xa

    aput-object v1, v6, v0

    const/16 v0, 0xb

    aput-object v5, v6, v0

    const/16 v0, 0xc

    aput-object v2, v6, v0

    sput-object v6, Lcom/whoop/design/models/items/ButtonCellModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ButtonCellModel$$serializer;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ButtonCellModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    :goto_8
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput-boolean v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    goto :goto_9

    :cond_a
    iput-boolean p12, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    :goto_9
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_a

    :cond_b
    iput-object p13, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    :goto_a
    and-int/lit16 p1, p1, 0x1000

    if-nez p1, :cond_c

    iput-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-void

    :cond_c
    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)V
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
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ly81/f;",
            "Z",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    .line 10
    iput-object p8, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    .line 12
    iput-object p10, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    .line 13
    iput-boolean p11, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    .line 14
    iput-object p12, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    .line 15
    iput-object p13, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object p2, v2

    :cond_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    move-object v1, p3

    :goto_0
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_2

    move-object v3, v2

    goto :goto_1

    :cond_2
    move-object/from16 v3, p4

    :goto_1
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_3

    move-object v4, v2

    goto :goto_2

    :cond_3
    move-object/from16 v4, p5

    :goto_2
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_4

    move-object v5, v2

    goto :goto_3

    :cond_4
    move-object/from16 v5, p6

    :goto_3
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_5

    move-object v6, v2

    goto :goto_4

    :cond_5
    move-object/from16 v6, p7

    :goto_4
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_6

    move-object v7, v2

    goto :goto_5

    :cond_6
    move-object/from16 v7, p8

    :goto_5
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_7

    move-object v8, v2

    goto :goto_6

    :cond_7
    move-object/from16 v8, p9

    :goto_6
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_8

    move-object v9, v2

    goto :goto_7

    :cond_8
    move-object/from16 v9, p10

    :goto_7
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_9

    const/4 v10, 0x1

    goto :goto_8

    :cond_9
    move/from16 v10, p11

    :goto_8
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_a

    move-object v11, v2

    goto :goto_9

    :cond_a
    move-object/from16 v11, p12

    :goto_9
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_b

    move-object/from16 p15, v2

    :goto_a
    move-object p3, p1

    move-object/from16 p4, p2

    move-object/from16 p5, v1

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move/from16 p13, v10

    move-object/from16 p14, v11

    move-object p2, p0

    goto :goto_b

    :cond_b
    move-object/from16 p15, p13

    goto :goto_a

    .line 16
    :goto_b
    invoke-direct/range {p2 .. p15}, Lcom/whoop/design/models/items/ButtonCellModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.atomic.theme.color.WhoopColorKey"

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$1()Lwc3/c;
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

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/modal/AnyModal;->Companion:Lcom/whoop/design/models/modal/AnyModal$Companion;

    invoke-virtual {v0}, Lcom/whoop/design/models/modal/AnyModal$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ButtonCellModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ButtonCellModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ButtonCellModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ButtonCellModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/ButtonCellModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;ILjava/lang/Object;)Lcom/whoop/design/models/items/ButtonCellModel;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-boolean v10, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    goto :goto_9

    :cond_a
    move/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/design/models/items/ButtonCellModel;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/items/ButtonCellModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/ButtonCellModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/ButtonCellModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ButtonCellModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    if-eqz v3, :cond_3

    :goto_1
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    if-eqz v3, :cond_5

    :goto_2
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    if-eqz v3, :cond_7

    :goto_3
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    if-eqz v3, :cond_9

    :goto_4
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    if-eqz v3, :cond_b

    :goto_5
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v2, 0x7

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_c
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    if-eqz v3, :cond_d

    :goto_6
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_7

    :cond_e
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    if-eqz v3, :cond_f

    :goto_7
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_8

    :cond_10
    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    if-eqz v3, :cond_11

    :goto_8
    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_11
    const/16 v2, 0xa

    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_9

    :cond_12
    iget-boolean v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    if-eq v3, v1, :cond_13

    :goto_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    invoke-interface {p1, p2, v2, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_13
    const/16 v1, 0xb

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_a

    :cond_14
    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    if-eqz v2, :cond_15

    :goto_a
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_15
    const/16 v1, 0xc

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_16

    goto :goto_b

    :cond_16
    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v2, :cond_17

    :goto_b
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_17
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    return v0
.end method

.method public final component12()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component13()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/design/models/items/ButtonCellModel;
    .locals 15
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
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ly81/f;",
            "Z",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/design/models/modal/AnyModal;",
            ")",
            "Lcom/whoop/design/models/items/ButtonCellModel;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/ButtonCellModel;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lcom/whoop/design/models/items/ButtonCellModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ly81/f;ZLcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/ButtonCellModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/ButtonCellModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    iget-object p1, p1, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getAvatars()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    return v0
.end method

.method public final getLeadingIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeadingImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getModal()Lcom/whoop/design/models/modal/AnyModal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    return-object v0
.end method

.method public final getStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTintColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitleType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrailingIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    if-nez v2, :cond_8

    move v2, v3

    goto :goto_8

    :cond_8
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_8
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_9

    move v2, v3

    goto :goto_9

    :cond_9
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_9
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    if-nez v1, :cond_a

    goto :goto_a

    :cond_a
    invoke-virtual {v1}, Lcom/whoop/design/models/modal/AnyModal;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/design/models/items/ButtonCellModel;->title:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/design/models/items/ButtonCellModel;->subtitle:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/ButtonCellModel;->titleType:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingIcon:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/design/models/items/ButtonCellModel;->leadingImageUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/design/models/items/ButtonCellModel;->trailingIcon:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/design/models/items/ButtonCellModel;->message:Ljava/lang/String;

    iget-object v8, v0, Lcom/whoop/design/models/items/ButtonCellModel;->style:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/design/models/items/ButtonCellModel;->avatars:Ljava/util/List;

    iget-object v10, v0, Lcom/whoop/design/models/items/ButtonCellModel;->tintColor:Ly81/f;

    iget-boolean v11, v0, Lcom/whoop/design/models/items/ButtonCellModel;->enabled:Z

    iget-object v12, v0, Lcom/whoop/design/models/items/ButtonCellModel;->destination:Lcom/whoop/navigation/e;

    iget-object v13, v0, Lcom/whoop/design/models/items/ButtonCellModel;->modal:Lcom/whoop/design/models/modal/AnyModal;

    const-string v14, ", subtitle="

    const-string v15, ", titleType="

    const-string v0, "ButtonCellModel(title="

    invoke-static {v0, v1, v14, v2, v15}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", leadingIcon="

    const-string v2, ", leadingImageUrl="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", trailingIcon="

    const-string v2, ", message="

    invoke-static {v0, v5, v1, v6, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", style="

    const-string v2, ", avatars="

    invoke-static {v0, v7, v1, v8, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tintColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

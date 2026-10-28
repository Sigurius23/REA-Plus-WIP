.class public final Lcom/whoop/design/models/items/FileViewerModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/FileViewerModel$$serializer;,
        Lcom/whoop/design/models/items/FileViewerModel$Companion;,
        Lcom/whoop/design/models/items/FileViewerModel$FileType;,
        Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;,
        Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;,
        Lcom/whoop/design/models/items/FileViewerModel$Scaling;,
        Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;,
        Lcom/whoop/design/models/items/FileViewerModel$Zoom;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0087\u0008\u0018\u0000 Y2\u00020\u00012\u00020\u0002:\u0008Z[\\]^_`YBK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B\u008d\u0001\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0011\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\u0015H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\rH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-JV\u0010.\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008.\u0010/J\u0010\u00100\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00080\u0010!J\u0010\u00101\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00081\u00102J\u001a\u00105\u001a\u0002042\u0008\u00103\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u00085\u00106J\'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010@\u001a\u0004\u0008A\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010B\u001a\u0004\u0008C\u0010#R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010D\u001a\u0004\u0008E\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010F\u001a\u0004\u0008G\u0010\'R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010H\u001a\u0004\u0008I\u0010)R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010J\u001a\u0004\u0008K\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010L\u001a\u0004\u0008M\u0010-R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00158\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u0010N\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RRE\u0010\u0018\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0015j\u0004\u0018\u0001`S\u00a2\u0006\u000c\u0008T\u0012\u0008\u0008U\u0012\u0004\u0008\t0V8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010N\u001a\u0004\u0008W\u0010P\"\u0004\u0008X\u0010R\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/FileViewerModel;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "fileUrl",
        "Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;",
        "urlType",
        "Lcom/whoop/design/models/items/FileViewerModel$FileType;",
        "fileType",
        "Lcom/whoop/design/models/items/FileViewerModel$Scaling;",
        "scaling",
        "Lcom/whoop/design/models/items/FileViewerModel$Zoom;",
        "zoom",
        "Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;",
        "horizontalAlignment",
        "Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;",
        "verticalAlignment",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)V",
        "",
        "seen0",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "aggregateBindings",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/items/FileViewerModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;",
        "component3",
        "()Lcom/whoop/design/models/items/FileViewerModel$FileType;",
        "component4",
        "()Lcom/whoop/design/models/items/FileViewerModel$Scaling;",
        "component5",
        "()Lcom/whoop/design/models/items/FileViewerModel$Zoom;",
        "component6",
        "()Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;",
        "component7",
        "()Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)Lcom/whoop/design/models/items/FileViewerModel;",
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
        "(Lcom/whoop/design/models/items/FileViewerModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getFileUrl",
        "Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;",
        "getUrlType",
        "Lcom/whoop/design/models/items/FileViewerModel$FileType;",
        "getFileType",
        "Lcom/whoop/design/models/items/FileViewerModel$Scaling;",
        "getScaling",
        "Lcom/whoop/design/models/items/FileViewerModel$Zoom;",
        "getZoom",
        "Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;",
        "getHorizontalAlignment",
        "Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;",
        "getVerticalAlignment",
        "Ljava/util/Map;",
        "getBindings",
        "()Ljava/util/Map;",
        "setBindings",
        "(Ljava/util/Map;)V",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "FileType",
        "FileUrlType",
        "Scaling",
        "Zoom",
        "HorizontalAlignment",
        "VerticalAlignment",
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

.field public static final Companion:Lcom/whoop/design/models/items/FileViewerModel$Companion;


# instance fields
.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

.field private final fileUrl:Ljava/lang/String;

.field private final horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

.field private final scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

.field private final urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

.field private final verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

.field private final zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/whoop/design/models/items/FileViewerModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/FileViewerModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/FileViewerModel;->Companion:Lcom/whoop/design/models/items/FileViewerModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/FileViewerModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/d;

    const/16 v4, 0x10

    invoke-direct {v3, v4}, Lw91/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/d;

    const/16 v5, 0x11

    invoke-direct {v4, v5}, Lw91/d;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/d;

    const/16 v6, 0x12

    invoke-direct {v5, v6}, Lw91/d;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lw91/d;

    const/16 v7, 0x13

    invoke-direct {v6, v7}, Lw91/d;-><init>(I)V

    invoke-static {v2, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lw91/d;

    const/16 v8, 0x14

    invoke-direct {v7, v8}, Lw91/d;-><init>(I)V

    invoke-static {v2, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lw91/d;

    const/16 v9, 0x15

    invoke-direct {v8, v9}, Lw91/d;-><init>(I)V

    invoke-static {v2, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    new-instance v9, Lw91/d;

    const/16 v10, 0x16

    invoke-direct {v9, v10}, Lw91/d;-><init>(I)V

    invoke-static {v2, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v9, 0x9

    new-array v9, v9, [Ll83/h;

    const/4 v10, 0x0

    aput-object v1, v9, v10

    const/4 v10, 0x1

    aput-object v3, v9, v10

    const/4 v3, 0x2

    aput-object v4, v9, v3

    const/4 v3, 0x3

    aput-object v5, v9, v3

    const/4 v3, 0x4

    aput-object v6, v9, v3

    const/4 v3, 0x5

    aput-object v7, v9, v3

    const/4 v3, 0x6

    aput-object v8, v9, v3

    const/4 v3, 0x7

    aput-object v2, v9, v3

    aput-object v1, v9, v0

    sput-object v9, Lcom/whoop/design/models/items/FileViewerModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/design/models/items/FileViewerModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/FileViewerModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/design/models/items/FileViewerModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->ABSOLUTE:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    .line 3
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 4
    sget-object p2, Lcom/whoop/design/models/items/FileViewerModel$FileType;->UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    .line 5
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 6
    sget-object p2, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->FIT:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 8
    sget-object p2, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->NONE:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    .line 9
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    .line 10
    sget-object p2, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    .line 11
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    .line 12
    sget-object p2, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    .line 13
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    const/4 p3, 0x0

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/FileViewerModel;->bindings:Ljava/util/Map;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/FileViewerModel;->bindings:Ljava/util/Map;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p3, p0, Lcom/whoop/design/models/items/FileViewerModel;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/design/models/items/FileViewerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)V
    .locals 1

    const-string v0, "fileUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaling"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoom"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalAlignment"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verticalAlignment"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    .line 16
    iput-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    .line 17
    iput-object p3, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    .line 18
    iput-object p4, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    .line 19
    iput-object p5, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    .line 20
    iput-object p6, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    .line 21
    iput-object p7, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    .line 22
    sget-object v0, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->ABSOLUTE:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_1

    .line 23
    sget-object v1, Lcom/whoop/design/models/items/FileViewerModel$FileType;->UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_2

    .line 24
    sget-object v2, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->FIT:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_3

    .line 25
    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->NONE:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    goto :goto_3

    :cond_3
    move-object v3, p5

    :goto_3
    and-int/lit8 v4, p8, 0x20

    if-eqz v4, :cond_4

    .line 26
    sget-object v4, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    goto :goto_4

    :cond_4
    move-object v4, p6

    :goto_4
    and-int/lit8 v5, p8, 0x40

    if-eqz v5, :cond_5

    .line 27
    sget-object v5, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    move-object p9, v5

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move-object p5, v1

    move-object p6, v2

    move-object p7, v3

    move-object p8, v4

    goto :goto_6

    :cond_5
    move-object p9, p7

    goto :goto_5

    .line 28
    :goto_6
    invoke-direct/range {p2 .. p9}, Lcom/whoop/design/models/items/FileViewerModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.FileViewerModel.FileUrlType"

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->values()[Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.FileViewerModel.FileType"

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$FileType;->values()[Lcom/whoop/design/models/items/FileViewerModel$FileType;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.FileViewerModel.Scaling"

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->values()[Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$2()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.FileViewerModel.Zoom"

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->values()[Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$3()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.FileViewerModel.HorizontalAlignment"

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->values()[Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$4()Lwc3/c;
    .locals 2

    const-string v0, "com.whoop.design.models.items.FileViewerModel.VerticalAlignment"

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->values()[Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$5()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/FileViewerModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_$2()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_$5()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/FileViewerModel;Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;ILjava/lang/Object;)Lcom/whoop/design/models/items/FileViewerModel;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/design/models/items/FileViewerModel;->copy(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)Lcom/whoop/design/models/items/FileViewerModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_$3()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/FileViewerModel;->_childSerializers$_anonymous_$4()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/FileViewerModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/FileViewerModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;->ABSOLUTE:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    if-eq v2, v3, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$FileType;->UNKNOWN:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    if-eq v2, v3, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$Scaling;->FIT:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    if-eq v2, v3, :cond_5

    :goto_2
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$Zoom;->NONE:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    if-eq v2, v3, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    if-eq v2, v3, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    sget-object v3, Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;->CENTER:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    if-eq v2, v3, :cond_b

    :goto_5
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FileViewerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FileViewerModel;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FileViewerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FileViewerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public bridge synthetic bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/whoop/design/models/items/FileViewerModel;->bind(Ljava/util/Map;)Lcom/whoop/design/models/items/FileViewerModel;

    move-result-object p1

    return-object p1
.end method

.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/items/FileViewerModel;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/items/FileViewerModel;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/FileViewerModel;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/FileViewerModel;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/FileViewerModelStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/FileViewerModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/FileViewerModel;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/models/items/FileViewerModel$FileType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/FileViewerModel$Scaling;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/models/items/FileViewerModel$Zoom;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)Lcom/whoop/design/models/items/FileViewerModel;
    .locals 9

    const-string v0, "fileUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "urlType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scaling"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "zoom"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "horizontalAlignment"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "verticalAlignment"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/FileViewerModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/whoop/design/models/items/FileViewerModel;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;Lcom/whoop/design/models/items/FileViewerModel$FileType;Lcom/whoop/design/models/items/FileViewerModel$Scaling;Lcom/whoop/design/models/items/FileViewerModel$Zoom;Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/FileViewerModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/FileViewerModel;

    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    iget-object v3, p1, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    iget-object v3, p1, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    iget-object v3, p1, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    iget-object v3, p1, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    iget-object v3, p1, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    iget-object p1, p1, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getFileType()Lcom/whoop/design/models/items/FileViewerModel$FileType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    return-object v0
.end method

.method public final getFileUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getHorizontalAlignment()Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    return-object v0
.end method

.method public final getScaling()Lcom/whoop/design/models/items/FileViewerModel$Scaling;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    return-object v0
.end method

.method public final getUrlType()Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    return-object v0
.end method

.method public final getVerticalAlignment()Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    return-object v0
.end method

.method public final getZoom()Lcom/whoop/design/models/items/FileViewerModel$Zoom;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/FileViewerModel;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/FileViewerModel;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/FileViewerModel;->urlType:Lcom/whoop/design/models/items/FileViewerModel$FileUrlType;

    iget-object v2, p0, Lcom/whoop/design/models/items/FileViewerModel;->fileType:Lcom/whoop/design/models/items/FileViewerModel$FileType;

    iget-object v3, p0, Lcom/whoop/design/models/items/FileViewerModel;->scaling:Lcom/whoop/design/models/items/FileViewerModel$Scaling;

    iget-object v4, p0, Lcom/whoop/design/models/items/FileViewerModel;->zoom:Lcom/whoop/design/models/items/FileViewerModel$Zoom;

    iget-object v5, p0, Lcom/whoop/design/models/items/FileViewerModel;->horizontalAlignment:Lcom/whoop/design/models/items/FileViewerModel$HorizontalAlignment;

    iget-object v6, p0, Lcom/whoop/design/models/items/FileViewerModel;->verticalAlignment:Lcom/whoop/design/models/items/FileViewerModel$VerticalAlignment;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "FileViewerModel(fileUrl="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", urlType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", fileType="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scaling="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", zoom="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", horizontalAlignment="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", verticalAlignment="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Ln71/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u001c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000bR\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u000bR\u0014\u0010\u0018\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u000bR\u0017\u0010\u001c\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u000b\u001a\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u000bR\u0014\u0010 \u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u000bR\u001d\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0007\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Ln71/p;",
        "",
        "<init>",
        "()V",
        "",
        "",
        "b",
        "Ljava/util/List;",
        "dataPoints",
        "Ln71/q;",
        "c",
        "Ln71/q;",
        "fakeHrZone0",
        "d",
        "fakeHrZone1",
        "e",
        "fakeHrZone2",
        "f",
        "fakeHrZone3",
        "g",
        "fakeHrZone4",
        "h",
        "fakeHrZone5",
        "i",
        "disconnected",
        "j",
        "getCalibrating",
        "()Ln71/q;",
        "calibrating",
        "k",
        "deviceOffBody",
        "l",
        "fwUpdateInProgress",
        "m",
        "a",
        "()Ljava/util/List;",
        "liveHrMonitorSamples",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Ln71/p;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ln71/q;

.field private static final d:Ln71/q;

.field private static final e:Ln71/q;

.field private static final f:Ln71/q;

.field private static final g:Ln71/q;

.field private static final h:Ln71/q;

.field private static final i:Ln71/q;

.field private static final j:Ln71/q;

.field private static final k:Ln71/q;

.field private static final l:Ln71/q;

.field private static final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln71/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Ln71/p;

    invoke-direct {v0}, Ln71/p;-><init>()V

    sput-object v0, Ln71/p;->a:Ln71/p;

    const/16 v0, 0x14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v0, 0x1e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/16 v0, 0x28

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/16 v0, 0x32

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v0, 0x50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v0, 0x5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v0, 0x64

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v0, 0x78

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v0, 0x46

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object v10, v7

    filled-new-array/range {v1 .. v10}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    sput-object v2, Ln71/p;->b:Ljava/util/List;

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->ZONE_0:Ln71/r;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    sput-object v0, Ln71/p;->c:Ln71/q;

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->ZONE_1:Ln71/r;

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v1

    sput-object v7, Ln71/p;->d:Ln71/q;

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->ZONE_2:Ln71/r;

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v1

    sput-object v8, Ln71/p;->e:Ln71/q;

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->ZONE_3:Ln71/r;

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v1

    sput-object v9, Ln71/p;->f:Ln71/q;

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->ZONE_4:Ln71/r;

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v7

    move-object v7, v1

    sput-object v7, Ln71/p;->g:Ln71/q;

    new-instance v1, Ln71/q;

    sget-object v3, Ln71/r;->ZONE_5:Ln71/r;

    invoke-direct/range {v1 .. v6}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ln71/p;->h:Ln71/q;

    new-instance v11, Ln71/q;

    sget-object v13, Ln71/r;->DISCONNECTED:Ln71/r;

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v11, Ln71/p;->i:Ln71/q;

    new-instance v12, Ln71/q;

    sget-object v14, Ln71/r;->CALIBRATING:Ln71/r;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v12 .. v17}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v12, Ln71/p;->j:Ln71/q;

    new-instance v13, Ln71/q;

    sget-object v15, Ln71/r;->DEVICE_OFF_BODY:Ln71/r;

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v13, Ln71/p;->k:Ln71/q;

    new-instance v14, Ln71/q;

    sget-object v16, Ln71/r;->FW_UPDATE_IN_PROGRESS:Ln71/r;

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Ln71/q;-><init>(Ljava/util/List;Ln71/r;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v14, Ln71/p;->l:Ln71/q;

    move-object v3, v0

    move-object v5, v8

    move-object v6, v9

    move-object v4, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object v12, v14

    move-object v8, v1

    filled-new-array/range {v3 .. v12}, [Ln71/q;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ln71/p;->m:Ljava/util/List;

    const/16 v0, 0x8

    sput v0, Ln71/p;->n:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ln71/q;",
            ">;"
        }
    .end annotation

    sget-object v0, Ln71/p;->m:Ljava/util/List;

    return-object v0
.end method

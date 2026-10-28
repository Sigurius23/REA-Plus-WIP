.class public final enum Ln71/r;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln71/r;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u001b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B/\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cj\u0002\u0008\u001dj\u0002\u0008\u001ej\u0002\u0008\u001fj\u0002\u0008 j\u0002\u0008!j\u0002\u0008\"j\u0002\u0008#j\u0002\u0008$j\u0002\u0008%j\u0002\u0008&\u00a8\u0006\'"
    }
    d2 = {
        "Ln71/r;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "zoneText",
        "Ly81/f;",
        "zoneColor",
        "Li91/a;",
        "graphBackground",
        "Lgz0/m0;",
        "icon",
        "<init>",
        "(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;)V",
        "",
        "isActive",
        "()Z",
        "shouldDrawMarkerLine",
        "isCalibrating",
        "Lcom/whoop/design/util/TextResource;",
        "getZoneText",
        "()Lcom/whoop/design/util/TextResource;",
        "Ly81/f;",
        "getZoneColor",
        "()Ly81/f;",
        "Li91/a;",
        "getGraphBackground",
        "()Li91/a;",
        "Lgz0/m0;",
        "getIcon",
        "()Lgz0/m0;",
        "ZONE_0",
        "ZONE_1",
        "ZONE_2",
        "ZONE_3",
        "ZONE_4",
        "ZONE_5",
        "DISCONNECTED",
        "CALIBRATING",
        "DEVICE_OFF_BODY",
        "FW_UPDATE_IN_PROGRESS",
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
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Ln71/r;

.field public static final enum CALIBRATING:Ln71/r;

.field public static final enum DEVICE_OFF_BODY:Ln71/r;

.field public static final enum DISCONNECTED:Ln71/r;

.field public static final enum FW_UPDATE_IN_PROGRESS:Ln71/r;

.field public static final enum ZONE_0:Ln71/r;

.field public static final enum ZONE_1:Ln71/r;

.field public static final enum ZONE_2:Ln71/r;

.field public static final enum ZONE_3:Ln71/r;

.field public static final enum ZONE_4:Ln71/r;

.field public static final enum ZONE_5:Ln71/r;


# instance fields
.field private final graphBackground:Li91/a;

.field private final icon:Lgz0/m0;

.field private final zoneColor:Ly81/f;

.field private final zoneText:Lcom/whoop/design/util/TextResource;


# direct methods
.method private static final synthetic $values()[Ln71/r;
    .locals 10

    sget-object v0, Ln71/r;->ZONE_0:Ln71/r;

    sget-object v1, Ln71/r;->ZONE_1:Ln71/r;

    sget-object v2, Ln71/r;->ZONE_2:Ln71/r;

    sget-object v3, Ln71/r;->ZONE_3:Ln71/r;

    sget-object v4, Ln71/r;->ZONE_4:Ln71/r;

    sget-object v5, Ln71/r;->ZONE_5:Ln71/r;

    sget-object v6, Ln71/r;->DISCONNECTED:Ln71/r;

    sget-object v7, Ln71/r;->CALIBRATING:Ln71/r;

    sget-object v8, Ln71/r;->DEVICE_OFF_BODY:Ln71/r;

    sget-object v9, Ln71/r;->FW_UPDATE_IN_PROGRESS:Ln71/r;

    filled-new-array/range {v0 .. v9}, [Ln71/r;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Ln71/r;

    sget v1, Lgy0/f;->X0:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget-object v4, Ly81/f;->STRAIN:Ly81/f;

    new-instance v1, Lmx1/o;

    const/16 v2, 0x17

    invoke-direct {v1, v2}, Lmx1/o;-><init>(I)V

    invoke-static {v1}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    const/16 v7, 0x8

    const/4 v8, 0x0

    const-string v1, "ZONE_0"

    const/4 v2, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ln71/r;->ZONE_0:Ln71/r;

    new-instance v1, Ln71/r;

    sget v0, Lgy0/f;->Y0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    sget-object v5, Ly81/f;->STRAIN_ZONE_1:Ly81/f;

    new-instance v0, Lmx1/o;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lmx1/o;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    const/16 v8, 0x8

    const/4 v9, 0x0

    const-string v2, "ZONE_1"

    const/4 v3, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Ln71/r;->ZONE_1:Ln71/r;

    new-instance v2, Ln71/r;

    sget v0, Lgy0/f;->Z0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget-object v6, Ly81/f;->STRAIN_ZONE_2:Ly81/f;

    new-instance v0, Lmx1/o;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v7

    const/16 v9, 0x8

    const/4 v10, 0x0

    const-string v3, "ZONE_2"

    const/4 v4, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Ln71/r;->ZONE_2:Ln71/r;

    new-instance v3, Ln71/r;

    sget v0, Lgy0/f;->a1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget-object v7, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    new-instance v0, Lmx1/o;

    const/16 v1, 0x1a

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v8

    const/16 v10, 0x8

    const/4 v11, 0x0

    const-string v4, "ZONE_3"

    const/4 v5, 0x3

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Ln71/r;->ZONE_3:Ln71/r;

    new-instance v4, Ln71/r;

    sget v0, Lgy0/f;->b1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget-object v8, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    new-instance v0, Lmx1/o;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v9

    const/16 v11, 0x8

    const/4 v12, 0x0

    const-string v5, "ZONE_4"

    const/4 v6, 0x4

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Ln71/r;->ZONE_4:Ln71/r;

    new-instance v5, Ln71/r;

    sget v0, Lgy0/f;->c1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    sget-object v9, Ly81/f;->STRAIN_ZONE_5:Ly81/f;

    new-instance v0, Lmx1/o;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v10

    const/16 v12, 0x8

    const/4 v13, 0x0

    const-string v6, "ZONE_5"

    const/4 v7, 0x5

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v13}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Ln71/r;->ZONE_5:Ln71/r;

    new-instance v6, Ln71/r;

    sget v0, Lgy0/f;->T0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    sget-object v14, Ly81/f;->WHITE_50:Ly81/f;

    sget-object v12, Lgz0/m0;->BLUETOOTH:Lgz0/m0;

    const/4 v13, 0x4

    move-object v10, v14

    const/4 v14, 0x0

    const-string v7, "DISCONNECTED"

    const/4 v8, 0x6

    invoke-direct/range {v6 .. v14}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v10

    sput-object v6, Ln71/r;->DISCONNECTED:Ln71/r;

    new-instance v10, Ln71/r;

    sget v0, Lgy0/f;->S0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    const/16 v17, 0xc

    const/16 v18, 0x0

    const-string v11, "CALIBRATING"

    const/4 v12, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Ln71/r;->CALIBRATING:Ln71/r;

    new-instance v10, Ln71/r;

    sget v0, Lgy0/f;->U0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    sget-object v16, Lgz0/m0;->REMOVE_STRAP:Lgz0/m0;

    const/16 v17, 0x4

    const-string v11, "DEVICE_OFF_BODY"

    const/16 v12, 0x8

    invoke-direct/range {v10 .. v18}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Ln71/r;->DEVICE_OFF_BODY:Ln71/r;

    new-instance v10, Ln71/r;

    sget v0, Lgy0/f;->V0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    sget-object v16, Lgz0/m0;->STRAP:Lgz0/m0;

    const-string v11, "FW_UPDATE_IN_PROGRESS"

    const/16 v12, 0x9

    invoke-direct/range {v10 .. v18}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v10, Ln71/r;->FW_UPDATE_IN_PROGRESS:Ln71/r;

    invoke-static {}, Ln71/r;->$values()[Ln71/r;

    move-result-object v0

    sput-object v0, Ln71/r;->$VALUES:[Ln71/r;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ln71/r;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ly81/f;",
            "Li91/a;",
            "Lgz0/m0;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Ln71/r;->zoneText:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p4, p0, Ln71/r;->zoneColor:Ly81/f;

    .line 4
    iput-object p5, p0, Ln71/r;->graphBackground:Li91/a;

    .line 5
    iput-object p6, p0, Ln71/r;->icon:Lgz0/m0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x8

    if-eqz p5, :cond_1

    .line 6
    sget-object p6, Lgz0/m0;->TINY_HEART_RATE:Lgz0/m0;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    .line 7
    invoke-direct/range {v0 .. v6}, Ln71/r;-><init>(Ljava/lang/String;ILcom/whoop/design/util/TextResource;Ly81/f;Li91/a;Lgz0/m0;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->k0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$1(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->l0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$2(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->m0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$3(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->n0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$4(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->o0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$5(Ly81/i;)Li2/t;
    .locals 8

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v2

    new-instance v0, Li2/x;

    invoke-direct {v0, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v0, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-wide/16 v5, 0x0

    const/16 v7, 0xe

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v7}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ln71/r;->_init_$lambda$3(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ln71/r;->_init_$lambda$1(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ln71/r;->_init_$lambda$5(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ln71/r;->_init_$lambda$0(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ln71/r;->_init_$lambda$4(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Ln71/r;->_init_$lambda$2(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ln71/r;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln71/r;
    .locals 1

    const-class v0, Ln71/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln71/r;

    return-object p0
.end method

.method public static values()[Ln71/r;
    .locals 1

    sget-object v0, Ln71/r;->$VALUES:[Ln71/r;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln71/r;

    return-object v0
.end method


# virtual methods
.method public final getGraphBackground()Li91/a;
    .locals 1

    iget-object v0, p0, Ln71/r;->graphBackground:Li91/a;

    return-object v0
.end method

.method public final getIcon()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Ln71/r;->icon:Lgz0/m0;

    return-object v0
.end method

.method public final getZoneColor()Ly81/f;
    .locals 1

    iget-object v0, p0, Ln71/r;->zoneColor:Ly81/f;

    return-object v0
.end method

.method public final getZoneText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Ln71/r;->zoneText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    sget-object v0, Ln71/r;->DISCONNECTED:Ln71/r;

    if-eq p0, v0, :cond_0

    sget-object v0, Ln71/r;->DEVICE_OFF_BODY:Ln71/r;

    if-eq p0, v0, :cond_0

    sget-object v0, Ln71/r;->FW_UPDATE_IN_PROGRESS:Ln71/r;

    if-eq p0, v0, :cond_0

    sget-object v0, Ln71/r;->CALIBRATING:Ln71/r;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isCalibrating()Z
    .locals 1

    sget-object v0, Ln71/r;->CALIBRATING:Ln71/r;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final shouldDrawMarkerLine()Z
    .locals 1

    sget-object v0, Ln71/r;->DISCONNECTED:Ln71/r;

    if-eq p0, v0, :cond_0

    sget-object v0, Ln71/r;->DEVICE_OFF_BODY:Ln71/r;

    if-eq p0, v0, :cond_0

    sget-object v0, Ln71/r;->FW_UPDATE_IN_PROGRESS:Ln71/r;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

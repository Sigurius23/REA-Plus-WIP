.class public final Lnl2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lnl2/e;",
        "",
        "<init>",
        "()V",
        "Lsz0/q0;",
        "b",
        "Lsz0/q0;",
        "a",
        "()Lsz0/q0;",
        "postMaxHr",
        "c",
        "turnOffManualHrZones",
        "d",
        "saveManualHrZones",
        "training_release"
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
.field public static final a:Lnl2/e;

.field private static final b:Lsz0/q0;

.field private static final c:Lsz0/q0;

.field private static final d:Lsz0/q0;

.field public static final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lnl2/e;

    invoke-direct {v0}, Lnl2/e;-><init>()V

    sput-object v0, Lnl2/e;->a:Lnl2/e;

    sget-object v0, Lnl2/b;->a:Lnl2/b;

    invoke-virtual {v0}, Lnl2/b;->d()Lsz0/q0;

    move-result-object v1

    new-instance v2, Lsz0/p0$b;

    sget v3, Lal2/d;->U:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0x3fd

    const/4 v13, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lsz0/q0;->d(Lsz0/q0;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lsz0/q0;

    move-result-object v1

    sput-object v1, Lnl2/e;->b:Lsz0/q0;

    invoke-virtual {v0}, Lnl2/b;->d()Lsz0/q0;

    move-result-object v2

    new-instance v3, Lsz0/p0$b;

    sget v1, Lal2/d;->V:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x3fd

    const/4 v14, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v2 .. v14}, Lsz0/q0;->d(Lsz0/q0;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lsz0/q0;

    move-result-object v1

    sput-object v1, Lnl2/e;->c:Lsz0/q0;

    invoke-virtual {v0}, Lnl2/b;->d()Lsz0/q0;

    move-result-object v2

    new-instance v3, Lsz0/p0$b;

    sget v0, Lal2/d;->T:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v14}, Lsz0/q0;->d(Lsz0/q0;Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILjava/lang/Object;)Lsz0/q0;

    move-result-object v0

    sput-object v0, Lnl2/e;->d:Lsz0/q0;

    sget v0, Lsz0/q0;->k:I

    sput v0, Lnl2/e;->e:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/e;->b:Lsz0/q0;

    return-object v0
.end method

.method public final b()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/e;->d:Lsz0/q0;

    return-object v0
.end method

.method public final c()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/e;->c:Lsz0/q0;

    return-object v0
.end method

.class public final Lnl2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lnl2/b;",
        "",
        "<init>",
        "()V",
        "Lsz0/q0;",
        "b",
        "Lsz0/q0;",
        "a",
        "()Lsz0/q0;",
        "loading",
        "c",
        "saving",
        "d",
        "e",
        "success",
        "networkError",
        "f",
        "serverError",
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
.field public static final a:Lnl2/b;

.field private static final b:Lsz0/q0;

.field private static final c:Lsz0/q0;

.field private static final d:Lsz0/q0;

.field private static final e:Lsz0/q0;

.field private static final f:Lsz0/q0;

.field public static final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lnl2/b;

    invoke-direct {v0}, Lnl2/b;-><init>()V

    sput-object v0, Lnl2/b;->a:Lnl2/b;

    new-instance v1, Lsz0/q0;

    sget-object v3, Lsz0/p0$c;->e:Lsz0/p0$c;

    const/16 v12, 0x3fd

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lnl2/b;->b:Lsz0/q0;

    new-instance v2, Lsz0/q0;

    sget-object v4, Lsz0/p0$f;->e:Lsz0/p0$f;

    const/16 v13, 0x3fd

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lnl2/b;->c:Lsz0/q0;

    new-instance v3, Lsz0/q0;

    new-instance v4, Lsz0/p0$h;

    sget v0, Lal2/d;->W:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v9, 0x6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lal2/d;->X:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    const/16 v14, 0x3f9

    const/4 v15, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lnl2/b;->d:Lsz0/q0;

    new-instance v4, Lsz0/p0$b;

    sget v0, Lal2/d;->g0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lal2/d;->S:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget v0, Lal2/d;->Y:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    sget v0, Lal2/d;->b:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    move-object v6, v4

    new-instance v4, Lsz0/q0;

    const/16 v15, 0x349

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lnl2/b;->e:Lsz0/q0;

    new-instance v5, Lsz0/p0$b;

    sget v0, Lal2/d;->h0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v5 .. v10}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lgy0/f;->L1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    sget v0, Lgy0/f;->W1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    sget v0, Lal2/d;->c:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v13

    move-object v7, v5

    new-instance v5, Lsz0/q0;

    const/16 v16, 0x349

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lnl2/b;->f:Lsz0/q0;

    sget v0, Lsz0/q0;->k:I

    sput v0, Lnl2/b;->g:I

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

    sget-object v0, Lnl2/b;->b:Lsz0/q0;

    return-object v0
.end method

.method public final b()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/b;->e:Lsz0/q0;

    return-object v0
.end method

.method public final c()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/b;->c:Lsz0/q0;

    return-object v0
.end method

.method public final d()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/b;->f:Lsz0/q0;

    return-object v0
.end method

.method public final e()Lsz0/q0;
    .locals 1

    sget-object v0, Lnl2/b;->d:Lsz0/q0;

    return-object v0
.end method

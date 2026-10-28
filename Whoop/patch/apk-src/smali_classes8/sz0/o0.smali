.class public final Lsz0/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\n\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0006\u001a\u0004\u0008\r\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0006\u001a\u0004\u0008\u0010\u0010\u0007R\u0017\u0010\u0012\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0017\u0010\u0013\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000f\u0010\u0007R\u0017\u0010\u0015\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0007\u00a8\u0006\u0016"
    }
    d2 = {
        "Lsz0/o0;",
        "",
        "<init>",
        "()V",
        "Lsz0/q0;",
        "b",
        "Lsz0/q0;",
        "()Lsz0/q0;",
        "loadingModalState",
        "c",
        "g",
        "successLoadingModalState",
        "d",
        "a",
        "canceledLoadingModalState",
        "e",
        "f",
        "subscriptionUpdatedModalState",
        "networkErrorModalState",
        "serverErrorModalState",
        "h",
        "notFoundErrorModalState",
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
.field public static final a:Lsz0/o0;

.field private static final b:Lsz0/q0;

.field private static final c:Lsz0/q0;

.field private static final d:Lsz0/q0;

.field private static final e:Lsz0/q0;

.field private static final f:Lsz0/q0;

.field private static final g:Lsz0/q0;

.field private static final h:Lsz0/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Lsz0/o0;

    invoke-direct {v0}, Lsz0/o0;-><init>()V

    sput-object v0, Lsz0/o0;->a:Lsz0/o0;

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

    sput-object v1, Lsz0/o0;->b:Lsz0/q0;

    new-instance v2, Lsz0/q0;

    new-instance v3, Lsz0/p0$h;

    sget v0, Lgy0/f;->e2:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v8, 0x6

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x3fd

    const/4 v14, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lsz0/o0;->c:Lsz0/q0;

    new-instance v3, Lsz0/q0;

    new-instance v4, Lsz0/p0$h;

    sget v0, Lgy0/f;->J1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    const/4 v9, 0x6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v14, 0x3fd

    const/4 v15, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lsz0/o0;->d:Lsz0/q0;

    new-instance v4, Lsz0/q0;

    new-instance v5, Lsz0/p0$h;

    sget v0, Lgy0/f;->d2:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    const/4 v10, 0x6

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v15, 0x3fd

    const/16 v16, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lsz0/o0;->e:Lsz0/q0;

    new-instance v5, Lsz0/q0;

    invoke-static {}, Lsz0/n0;->v()Lsz0/p0$b;

    move-result-object v7

    sget v0, Lgy0/f;->T1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    sget v0, Lgy0/f;->W1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    const/16 v16, 0x3e9

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lsz0/o0;->f:Lsz0/q0;

    new-instance v6, Lsz0/q0;

    invoke-static {}, Lsz0/n0;->t()Lsz0/p0$b;

    move-result-object v8

    sget v0, Lgy0/f;->L1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    sget v0, Lgy0/f;->W1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    sget v0, Lgy0/f;->K1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v14

    const/16 v17, 0x369

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v6 .. v18}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lsz0/o0;->g:Lsz0/q0;

    new-instance v7, Lsz0/q0;

    invoke-static {}, Lsz0/n0;->u()Lsz0/p0$b;

    move-result-object v9

    sget v0, Lgy0/f;->R1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v10

    sget v0, Lgy0/f;->B0:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    const/16 v18, 0x3e9

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v7 .. v19}, Lsz0/q0;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;ZZLcom/whoop/design/util/TextResource;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v7, Lsz0/o0;->h:Lsz0/q0;

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

    sget-object v0, Lsz0/o0;->d:Lsz0/q0;

    return-object v0
.end method

.method public final b()Lsz0/q0;
    .locals 1

    sget-object v0, Lsz0/o0;->b:Lsz0/q0;

    return-object v0
.end method

.method public final c()Lsz0/q0;
    .locals 1

    sget-object v0, Lsz0/o0;->f:Lsz0/q0;

    return-object v0
.end method

.method public final d()Lsz0/q0;
    .locals 1

    sget-object v0, Lsz0/o0;->h:Lsz0/q0;

    return-object v0
.end method

.method public final e()Lsz0/q0;
    .locals 1

    sget-object v0, Lsz0/o0;->g:Lsz0/q0;

    return-object v0
.end method

.method public final f()Lsz0/q0;
    .locals 1

    sget-object v0, Lsz0/o0;->e:Lsz0/q0;

    return-object v0
.end method

.method public final g()Lsz0/q0;
    .locals 1

    sget-object v0, Lsz0/o0;->c:Lsz0/q0;

    return-object v0
.end method

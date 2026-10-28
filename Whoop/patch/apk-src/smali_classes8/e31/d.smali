.class public final Le31/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000c\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0006\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0010"
    }
    d2 = {
        "Le31/d;",
        "",
        "<init>",
        "()V",
        "Le31/c;",
        "b",
        "Le31/c;",
        "a",
        "()Le31/c;",
        "loadingModalState",
        "c",
        "d",
        "successLoadingModalState",
        "networkErrorModalState",
        "e",
        "serverErrorModalState",
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
.field public static final a:Le31/d;

.field private static final b:Le31/c;

.field private static final c:Le31/c;

.field private static final d:Le31/c;

.field private static final e:Le31/c;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Le31/d;

    invoke-direct {v0}, Le31/d;-><init>()V

    sput-object v0, Le31/d;->a:Le31/d;

    new-instance v1, Le31/c;

    sget-object v3, Lsz0/p0$c;->e:Lsz0/p0$c;

    const/16 v8, 0x3d

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Le31/d;->b:Le31/c;

    new-instance v2, Le31/c;

    new-instance v3, Lsz0/p0$h;

    sget v0, Lgy0/f;->e2:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    const/4 v8, 0x6

    const-wide/16 v5, 0x0

    invoke-direct/range {v3 .. v9}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v9, 0x3d

    const/4 v10, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Le31/d;->c:Le31/c;

    new-instance v3, Le31/c;

    invoke-static {}, Lsz0/n0;->v()Lsz0/p0$b;

    move-result-object v5

    sget v0, Lgy0/f;->T1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    new-instance v7, Le31/a;

    sget v0, Lgy0/f;->W1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v7 .. v12}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v10, 0x31

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v11}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Le31/d;->d:Le31/c;

    new-instance v4, Le31/c;

    invoke-static {}, Le31/e;->a()Lsz0/p0$b;

    move-result-object v6

    sget v0, Lgy0/f;->k1:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    new-instance v8, Le31/a;

    const-string v0, "RELOAD"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v0, Lkd1/o$a;

    sget v1, Lgy0/a;->F2:I

    invoke-direct {v0, v1}, Lkd1/o$a;-><init>(I)V

    invoke-virtual {v0}, Lkd1/o$a;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const/4 v12, 0x2

    const/4 v13, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v8 .. v13}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x29

    const/4 v12, 0x0

    const/4 v5, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v12}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Le31/d;->e:Le31/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Le31/c;
    .locals 1

    sget-object v0, Le31/d;->b:Le31/c;

    return-object v0
.end method

.method public final b()Le31/c;
    .locals 1

    sget-object v0, Le31/d;->d:Le31/c;

    return-object v0
.end method

.method public final c()Le31/c;
    .locals 1

    sget-object v0, Le31/d;->e:Le31/c;

    return-object v0
.end method

.method public final d()Le31/c;
    .locals 1

    sget-object v0, Le31/d;->c:Le31/c;

    return-object v0
.end method

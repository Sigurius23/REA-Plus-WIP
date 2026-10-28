.class public abstract Le31/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\"\u0017\u0010\u0010\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\n\u001a\u0004\u0008\u000f\u0010\u000c\u00a8\u0006\u0011"
    }
    d2 = {
        "Lsz0/p0$b;",
        "a",
        "Lsz0/p0$b;",
        "getOfflineProgressModalType",
        "()Lsz0/p0$b;",
        "offlineProgressModalType",
        "b",
        "noDataProgressModalType",
        "Le31/c;",
        "c",
        "Le31/c;",
        "getSampleLoadingViewState",
        "()Le31/c;",
        "sampleLoadingViewState",
        "d",
        "getSampleNoDataViewState",
        "sampleNoDataViewState",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lsz0/p0$b;

.field private static final b:Lsz0/p0$b;

.field private static final c:Le31/c;

.field private static final d:Le31/c;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lsz0/p0$b;

    sget v1, Lgy0/f;->U1:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    new-instance v3, Lkd1/o$a;

    sget v2, Lgy0/a;->c2:I

    invoke-direct {v3, v2}, Lkd1/o$a;-><init>(I)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Le31/e;->a:Lsz0/p0$b;

    new-instance v3, Lsz0/p0$b;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->t:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    const/4 v2, 0x1

    invoke-direct {v3, v0, v2, v1}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;)V

    sput-object v3, Le31/e;->b:Lsz0/p0$b;

    new-instance v4, Le31/c;

    sget-object v6, Lsz0/p0$c;->e:Lsz0/p0$c;

    const/16 v11, 0x3d

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Le31/e;->c:Le31/c;

    new-instance v1, Le31/c;

    const-string v0, "Couldn\'t load data."

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Le31/a;

    const-string v0, "RELOAD"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v0, Lkd1/o$a;

    sget v2, Lgy0/a;->F2:I

    invoke-direct {v0, v2}, Lkd1/o$a;-><init>(I)V

    invoke-virtual {v0}, Lkd1/o$a;->a()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x2

    invoke-direct/range {v5 .. v10}, Le31/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x29

    const/4 v9, 0x0

    const/4 v2, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v9}, Le31/c;-><init>(Landroidx/compose/ui/Modifier;Lsz0/p0;Lcom/whoop/design/util/TextResource;Le31/a;Le31/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Le31/e;->d:Le31/c;

    return-void
.end method

.method public static final a()Lsz0/p0$b;
    .locals 1

    sget-object v0, Le31/e;->b:Lsz0/p0$b;

    return-object v0
.end method

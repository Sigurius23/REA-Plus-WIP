.class public abstract Ll31/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0002\"\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0001\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "normalTitle",
        "b",
        "compactTitle",
        "",
        "Lc41/a0;",
        "c",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "addTileSamples",
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
.field private static final a:Lcom/whoop/design/util/TextResource;

.field private static final b:Lcom/whoop/design/util/TextResource;

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/a0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const-string v0, "ADD EXERCISE"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sput-object v4, Ll31/b;->a:Lcom/whoop/design/util/TextResource;

    const-string v0, "START AN ACTIVITY"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sput-object v0, Ll31/b;->b:Lcom/whoop/design/util/TextResource;

    new-instance v1, Lc41/a0;

    sget-object v3, Lc41/b0$b;->g:Lc41/b0$b;

    const/16 v9, 0x79

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v1

    new-instance v1, Lc41/a0;

    const/16 v9, 0x71

    invoke-direct/range {v1 .. v10}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lc41/a0;

    sget-object v7, Lc41/b0$a;->g:Lc41/b0$a;

    const/16 v13, 0x79

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v8, v0

    invoke-direct/range {v5 .. v14}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v5

    new-instance v5, Lc41/a0;

    const/16 v13, 0x71

    invoke-direct/range {v5 .. v14}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v5

    new-instance v5, Lc41/a0;

    sget-object v7, Lc41/b0$c;->g:Lc41/b0$c;

    const/16 v13, 0x79

    invoke-direct/range {v5 .. v14}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v5

    new-instance v5, Lc41/a0;

    const/16 v13, 0x71

    invoke-direct/range {v5 .. v14}, Lc41/a0;-><init>(Ljava/lang/Object;Lc41/b0;Lcom/whoop/design/util/TextResource;ZILy81/e;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v0

    move-object v6, v1

    move-object v8, v2

    move-object v9, v3

    move-object v10, v5

    move-object v5, v15

    filled-new-array/range {v5 .. v10}, [Lc41/a0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Ll31/b;->c:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/a0;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll31/b;->c:Ljava/util/List;

    return-object v0
.end method

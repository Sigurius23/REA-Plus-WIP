.class public abstract Lc41/f4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001d\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0002\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lc41/g4;",
        "a",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "onboardingTileStates",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/g4;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lc41/g4;

    const-string v8, "GETTING STARTED"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v9, "To Do List for your First Days on WHOOP"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/16 v5, 0x8

    invoke-direct/range {v0 .. v7}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x1

    const/16 v15, 0x8

    move-object v10, v1

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x2

    move-object v10, v2

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x3

    move-object v10, v3

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x4

    move-object v10, v4

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x5

    move-object v10, v5

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x6

    move-object v10, v6

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x7

    move-object v10, v7

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Lc41/g4;

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/16 v14, 0x8

    invoke-direct/range {v10 .. v17}, Lc41/g4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v10

    filled-new-array/range {v0 .. v8}, [Lc41/g4;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/f4;->a:Ljava/util/List;

    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc41/g4;",
            ">;"
        }
    .end annotation

    sget-object v0, Lc41/f4;->a:Ljava/util/List;

    return-object v0
.end method

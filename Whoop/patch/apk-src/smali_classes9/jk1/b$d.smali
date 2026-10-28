.class public final Ljk1/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljk1/b;->u(Lfk1/a;)Ljb1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 28

    move-object/from16 v0, p1

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lk71/m;

    sget-object v16, Lgz0/m0;->CARET_FORWARD:Lgz0/m0;

    sget-object v11, Ly81/f;->WHITE_10:Ly81/f;

    const v26, 0x7fdeff

    const/16 v27, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lk71/m;->b(Lk71/m;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lk71/d;Lk71/d;Ljava/util/List;Lm91/u;Ly81/f;ZZZLy71/g;Lgz0/m0;Lk71/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lk71/p;Lp01/b;Lcom/whoop/navigation/e;Lp81/c;Lk71/d0;Ljava/util/List;ILjava/lang/Object;)Lk71/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Ljk1/b$d;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method

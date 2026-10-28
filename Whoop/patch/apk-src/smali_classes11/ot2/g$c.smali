.class public final Lot2/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lot2/g;->f(Ljt2/m$i;Ljt2/d;)Ljava/util/List;
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


# instance fields
.field final synthetic w:Lcom/whoop/design/models/items/HorizontalStatModel;


# direct methods
.method public constructor <init>(Lcom/whoop/design/models/items/HorizontalStatModel;)V
    .locals 0

    iput-object p1, p0, Lot2/g$c;->w:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Lsz0/q;

    iget-object v1, v0, Lot2/g$c;->w:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTrendType()Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, Lot2/w;->a(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Ly81/f;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v12, v1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_0

    :goto_2
    iget-object v1, v0, Lot2/g$c;->w:Lcom/whoop/design/models/items/HorizontalStatModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/HorizontalStatModel;->getStatTrendType()Lcom/whoop/design/atomic/atom/TrendTypeEnum;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lot2/w;->a(Lcom/whoop/design/atomic/atom/TrendTypeEnum;)Ly81/f;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_4

    :cond_2
    :goto_3
    move-object v13, v1

    goto :goto_5

    :cond_3
    :goto_4
    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    goto :goto_3

    :goto_5
    const/16 v16, 0xcff

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Lsz0/q;->b(Lsz0/q;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILjava/lang/Object;)Lsz0/q;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lot2/g$c;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method

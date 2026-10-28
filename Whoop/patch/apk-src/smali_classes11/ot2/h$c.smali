.class public final Lot2/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lot2/h;->e(Ljt2/m$i;Ljt2/d;)Ljava/util/List;
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
.field final synthetic w:Lot2/h;

.field final synthetic x:Ljt2/d;

.field final synthetic y:Ljt2/m$i;

.field final synthetic z:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;


# direct methods
.method public constructor <init>(Lot2/h;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;)V
    .locals 0

    iput-object p1, p0, Lot2/h$c;->w:Lot2/h;

    iput-object p2, p0, Lot2/h$c;->x:Ljt2/d;

    iput-object p3, p0, Lot2/h$c;->y:Ljt2/m$i;

    iput-object p4, p0, Lot2/h$c;->z:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

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

    iget-object v1, v0, Lot2/h$c;->w:Lot2/h;

    invoke-static {v1}, Lot2/h;->c(Lot2/h;)Lot2/s;

    move-result-object v1

    iget-object v2, v0, Lot2/h$c;->x:Ljt2/d;

    iget-object v4, v0, Lot2/h$c;->y:Ljt2/m$i;

    iget-object v5, v0, Lot2/h$c;->z:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual {v1, v2, v4, v5}, Lot2/s;->a(Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v3}, Lsz0/q;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_0
    move-object v5, v1

    sget-object v13, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v4, Lmt2/g$g;

    iget-object v1, v0, Lot2/h$c;->z:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v1

    invoke-direct {v4, v1}, Lmt2/g$g;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)V

    const/16 v16, 0xdfc

    const/16 v17, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Lsz0/q;->b(Lsz0/q;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILjava/lang/Object;)Lsz0/q;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lot2/h$c;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method

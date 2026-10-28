.class public final Lrv2/e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrv2/e;-><init>()V
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
    .locals 19

    move-object/from16 v0, p1

    const-string v1, "it"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lny0/p0;

    new-instance v6, Ly71/g;

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Lih0/d0;->E(Lx81/d;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-direct {v6, v0, v1, v3, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Lrv2/e$b;->w:Lrv2/e$b;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v7

    const/16 v17, 0x3fe7

    const/16 v18, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v2 .. v18}, Lny0/p0;->b(Lny0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILjava/lang/Object;)Lny0/p0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lrv2/e$d;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method

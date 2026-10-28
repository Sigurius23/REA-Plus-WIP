.class final Lcom/whoop/widget/ui/healthspan/a$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/widget/ui/healthspan/a;->e(Ljava/lang/Integer;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lf6/a;",
        "preferences",
        "Ll83/a0;",
        "<anonymous>",
        "(Lf6/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.widget.ui.healthspan.HealthspanWidgetStateWriter$updateBatteryPercentage$2$1"
    f = "HealthspanWidgetStateWriter.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/widget/ui/healthspan/a;

.field final synthetic z:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/whoop/widget/ui/healthspan/a;Ljava/lang/Integer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/widget/ui/healthspan/a;",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/widget/ui/healthspan/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/widget/ui/healthspan/a$e;->y:Lcom/whoop/widget/ui/healthspan/a;

    iput-object p2, p0, Lcom/whoop/widget/ui/healthspan/a$e;->z:Ljava/lang/Integer;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/widget/ui/healthspan/a$e;

    iget-object v1, p0, Lcom/whoop/widget/ui/healthspan/a$e;->y:Lcom/whoop/widget/ui/healthspan/a;

    iget-object v2, p0, Lcom/whoop/widget/ui/healthspan/a$e;->z:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/widget/ui/healthspan/a$e;-><init>(Lcom/whoop/widget/ui/healthspan/a;Ljava/lang/Integer;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/widget/ui/healthspan/a$e;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf6/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/widget/ui/healthspan/a$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/widget/ui/healthspan/a$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/widget/ui/healthspan/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lf6/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/widget/ui/healthspan/a$e;->invoke(Lf6/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/whoop/widget/ui/healthspan/a$e;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lf6/a;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lcom/whoop/widget/ui/healthspan/a$e;->w:I

    if-nez v0, :cond_1

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    const-string v3, "WIDGET_KEY_HEALTHSPAN_VIEW_STATE"

    invoke-static {v3}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    invoke-virtual {v2, v0}, Lf6/a;->b(Lf6/d;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    iget-object v5, v1, Lcom/whoop/widget/ui/healthspan/a$e;->y:Lcom/whoop/widget/ui/healthspan/a;

    :try_start_0
    invoke-static {v5}, Lcom/whoop/widget/ui/healthspan/a;->a(Lcom/whoop/widget/ui/healthspan/a;)Lad3/c;

    move-result-object v5

    sget-object v6, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->Companion:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;

    invoke-virtual {v6}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/b;

    invoke-virtual {v5, v6, v0}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v5, Ltr2/n;->a:Ltr2/n$a;

    const-string v6, "HealthspanWidgetStateWriter"

    invoke-virtual {v5, v6}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    const/4 v6, 0x0

    new-array v6, v6, [Lqr2/a$a;

    const-string v7, "Failed to decode Healthspan widget state"

    invoke-interface {v5, v7, v0, v6}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v5, :cond_0

    invoke-static {v3}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v0

    iget-object v3, v1, Lcom/whoop/widget/ui/healthspan/a$e;->y:Lcom/whoop/widget/ui/healthspan/a;

    invoke-static {v3}, Lcom/whoop/widget/ui/healthspan/a;->a(Lcom/whoop/widget/ui/healthspan/a;)Lad3/c;

    move-result-object v3

    sget-object v6, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->Companion:Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;

    invoke-virtual {v6}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState$a;->serializer()Lwc3/c;

    move-result-object v6

    check-cast v6, Lwc3/j;

    iget-object v14, v1, Lcom/whoop/widget/ui/healthspan/a$e;->z:Ljava/lang/Integer;

    const/16 v15, 0xff

    const/16 v16, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v1, v17

    invoke-static/range {v5 .. v16}, Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;->copy$default(Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;Ljava/lang/Long;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/widget/ui/healthspan/HealthspanWidgetLockedContentViewState;ZLjava/lang/Integer;ILjava/lang/Object;)Lcom/whoop/widget/ui/healthspan/HealthspanWidgetViewState;

    move-result-object v5

    invoke-virtual {v3, v1, v5}, Lad3/c;->d(Lwc3/j;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    :cond_0
    return-object v4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

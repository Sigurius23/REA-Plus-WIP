.class public final Lcom/iterable/iterableapi/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La00/g;


# direct methods
.method public constructor <init>(La00/g;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/iterable/iterableapi/e2;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/e2;->x:La00/g;

    return-void
.end method

.method public constructor <init>(La00/g;Lcom/iterable/iterableapi/b2;)V
    .locals 0

    const/4 p2, 0x0

    iput p2, p0, Lcom/iterable/iterableapi/e2;->w:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/e2;->x:La00/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lcom/iterable/iterableapi/e2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/iterable/iterableapi/e2;->x:La00/g;

    iget-object v0, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/iterable/iterableapi/a;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "HealthMonitor"

    const-string v3, "DB Error notified to healthMonitor"

    invoke-static {v2, v3}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/iterable/iterableapi/a;->a:Z

    goto :goto_0

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/iterable/iterableapi/e2;->x:La00/g;

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/iterable/iterableapi/d2;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/d2;->c()V

    goto :goto_1

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

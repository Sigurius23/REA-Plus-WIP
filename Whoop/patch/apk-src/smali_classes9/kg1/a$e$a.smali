.class public final Lkg1/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkg1/a$e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

.field final synthetic w:Lec3/m;

.field final synthetic x:Lkg1/a;

.field final synthetic y:J

.field final synthetic z:Z


# direct methods
.method public constructor <init>(Lec3/m;Lkg1/a;JZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V
    .locals 0

    iput-object p1, p0, Lkg1/a$e$a;->w:Lec3/m;

    iput-object p2, p0, Lkg1/a$e$a;->x:Lkg1/a;

    iput-wide p3, p0, Lkg1/a$e$a;->y:J

    iput-boolean p5, p0, Lkg1/a$e$a;->z:Z

    iput-object p6, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 12

    instance-of v0, p2, Lkg1/a$e$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkg1/a$e$a$a;

    iget v1, v0, Lkg1/a$e$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkg1/a$e$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkg1/a$e$a$a;

    invoke-direct {v0, p0, p2}, Lkg1/a$e$a$a;-><init>(Lkg1/a$e$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkg1/a$e$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkg1/a$e$a$a;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkg1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lkg1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lkg1/a$e$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lkg1/a$e$a$a;->K:I

    iget-object v2, v0, Lkg1/a$e$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lgt0/h;

    iget-object v4, v0, Lkg1/a$e$a$a;->I:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    iget-object v4, v0, Lkg1/a$e$a$a;->H:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v5, v0, Lkg1/a$e$a$a;->G:Ljava/lang/Object;

    check-cast v5, Lec3/m;

    iget-object v5, v0, Lkg1/a$e$a$a;->E:Ljava/lang/Object;

    check-cast v5, Lkg1/a$e$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lkg1/a$e$a;->w:Lec3/m;

    move-object v2, p1

    check-cast v2, Lgt0/h;

    iget-object p1, p0, Lkg1/a$e$a;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->g(Lkg1/a;)Ljava/time/Clock;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v7

    iget-wide v9, p0, Lkg1/a$e$a;->y:J

    sub-long/2addr v7, v9

    const/16 p1, 0x3e8

    int-to-long v9, p1

    div-long/2addr v7, v9

    instance-of p1, v2, Lgt0/h$e;

    const/4 v9, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lkg1/a$e$a;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->i(Lkg1/a;)Lgt0/d;

    move-result-object p1

    iget-boolean v4, p0, Lkg1/a$e$a;->z:Z

    iget-object v10, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-interface {p1, v4, v10, v7, v8}, Lgt0/d;->d(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V

    iget-object p1, p0, Lkg1/a$e$a;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->l(Lkg1/a;)Lrg1/c;

    move-result-object p1

    iget-object v4, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-virtual {p1, v4}, Lrg1/c;->e(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;)V

    iget-object p1, p0, Lkg1/a$e$a;->x:Lkg1/a;

    iget-object v4, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iput-object v6, v0, Lkg1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lkg1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v2, v0, Lkg1/a$e$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lkg1/a$e$a$a;->K:I

    iput v9, v0, Lkg1/a$e$a$a;->L:I

    iput-wide v7, v0, Lkg1/a$e$a$a;->M:J

    iput v5, v0, Lkg1/a$e$a$a;->x:I

    invoke-static {p1, v4, v0}, Lkg1/a;->f(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_3

    :cond_4
    move-object v4, p2

    move p1, v9

    :goto_1
    move v9, p1

    move-object p2, v4

    goto :goto_2

    :cond_5
    instance-of p1, v2, Lgt0/h$d;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lkg1/a$e$a;->x:Lkg1/a;

    invoke-static {p1}, Lkg1/a;->i(Lkg1/a;)Lgt0/d;

    move-result-object p1

    iget-boolean v4, p0, Lkg1/a$e$a;->z:Z

    iget-object v5, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-interface {p1, v4, v5, v7, v8}, Lgt0/d;->d(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V

    goto :goto_2

    :cond_6
    instance-of p1, v2, Lgt0/h$b;

    if-eqz p1, :cond_8

    move-object p1, v2

    check-cast p1, Lgt0/h$b;

    invoke-virtual {p1}, Lgt0/h$b;->c()Lgt0/f;

    move-result-object v5

    instance-of v5, v5, Lgt0/f$b;

    if-nez v5, :cond_7

    iget-object v5, p0, Lkg1/a$e$a;->x:Lkg1/a;

    invoke-static {v5}, Lkg1/a;->i(Lkg1/a;)Lgt0/d;

    move-result-object v5

    iget-boolean v10, p0, Lkg1/a$e$a;->z:Z

    iget-object v11, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    invoke-interface {v5, v10, v11, v7, v8}, Lgt0/d;->d(ZLcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;J)V

    :cond_7
    invoke-virtual {p1}, Lgt0/h$b;->c()Lgt0/f;

    move-result-object p1

    instance-of p1, p1, Lgt0/f$i;

    if-nez p1, :cond_8

    iget-object p1, p0, Lkg1/a$e$a;->x:Lkg1/a;

    iget-object v5, p0, Lkg1/a$e$a;->E:Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    iput-object v6, v0, Lkg1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object p2, v0, Lkg1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v2, v0, Lkg1/a$e$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lkg1/a$e$a$a;->K:I

    iput v9, v0, Lkg1/a$e$a$a;->L:I

    iput-wide v7, v0, Lkg1/a$e$a$a;->M:J

    iput v4, v0, Lkg1/a$e$a$a;->x:I

    invoke-static {p1, v5, v0}, Lkg1/a;->f(Lkg1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_8
    :goto_2
    iput-object v6, v0, Lkg1/a$e$a$a;->y:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->E:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->F:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->G:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->H:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->I:Ljava/lang/Object;

    iput-object v6, v0, Lkg1/a$e$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lkg1/a$e$a$a;->K:I

    iput v3, v0, Lkg1/a$e$a$a;->x:I

    invoke-interface {p2, v2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_3
    return-object v1

    :cond_9
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

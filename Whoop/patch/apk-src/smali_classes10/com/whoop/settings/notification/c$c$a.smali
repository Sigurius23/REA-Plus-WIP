.class public final Lcom/whoop/settings/notification/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/notification/c$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;

.field final synthetic x:Lcom/whoop/settings/notification/c;


# direct methods
.method public constructor <init>(Lec3/m;Lcom/whoop/settings/notification/c;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/notification/c$c$a;->w:Lec3/m;

    iput-object p2, p0, Lcom/whoop/settings/notification/c$c$a;->x:Lcom/whoop/settings/notification/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/whoop/settings/notification/c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/settings/notification/c$c$a$a;

    iget v1, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/settings/notification/c$c$a$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/settings/notification/c$c$a$a;-><init>(Lcom/whoop/settings/notification/c$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/settings/notification/c$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    const/4 v3, 0x5

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/settings/notification/c$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/whoop/settings/notification/c$c$a$a;->K:I

    iget-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->J:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/settings/notification/a;

    iget-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->I:Ljava/lang/Object;

    check-cast v2, Lq83/d;

    iget-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->H:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v4, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    iget-object v4, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/settings/notification/c$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, p0, Lcom/whoop/settings/notification/c$c$a;->w:Lec3/m;

    check-cast p1, Lcom/whoop/settings/notification/a;

    instance-of p2, p1, Lcom/whoop/settings/notification/a$a;

    const/4 v9, 0x0

    if-eqz p2, :cond_5

    iget-object p1, p0, Lcom/whoop/settings/notification/c$c$a;->x:Lcom/whoop/settings/notification/c;

    invoke-static {p1}, Lcom/whoop/settings/notification/c;->c(Lcom/whoop/settings/notification/c;)Lic2/b;

    move-result-object p1

    invoke-virtual {p1}, Lic2/b;->f()V

    iget-object p1, p0, Lcom/whoop/settings/notification/c$c$a;->x:Lcom/whoop/settings/notification/c;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->K:I

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->L:I

    iput v7, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    invoke-static {p1, v0}, Lcom/whoop/settings/notification/c;->f(Lcom/whoop/settings/notification/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto/16 :goto_2

    :cond_4
    move p1, v9

    goto/16 :goto_1

    :cond_5
    instance-of p2, p1, Lcom/whoop/settings/notification/a$b;

    if-eqz p2, :cond_7

    check-cast p1, Lcom/whoop/settings/notification/a$b;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/a$b;->b()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcom/whoop/settings/notification/c$c$a;->x:Lcom/whoop/settings/notification/c;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/a$b;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->K:I

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->L:I

    iput v6, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    invoke-static {p2, p1, v0}, Lcom/whoop/settings/notification/c;->a(Lcom/whoop/settings/notification/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_6
    iget-object p2, p0, Lcom/whoop/settings/notification/c$c$a;->x:Lcom/whoop/settings/notification/c;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/a$b;->a()Ljava/lang/String;

    move-result-object p1

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->K:I

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->L:I

    iput v5, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    invoke-static {p2, p1, v0}, Lcom/whoop/settings/notification/c;->b(Lcom/whoop/settings/notification/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_7
    instance-of p2, p1, Lcom/whoop/settings/notification/a$c;

    if-eqz p2, :cond_9

    iget-object p2, p0, Lcom/whoop/settings/notification/c$c$a;->x:Lcom/whoop/settings/notification/c;

    check-cast p1, Lcom/whoop/settings/notification/a$c;

    invoke-virtual {p1}, Lcom/whoop/settings/notification/a$c;->a()Z

    move-result v5

    invoke-virtual {p1}, Lcom/whoop/settings/notification/a$c;->b()Z

    move-result p1

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/settings/notification/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->J:Ljava/lang/Object;

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->K:I

    iput v9, v0, Lcom/whoop/settings/notification/c$c$a$a;->L:I

    iput v4, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    invoke-static {p2, v5, p1, v0}, Lcom/whoop/settings/notification/c;->g(Lcom/whoop/settings/notification/c;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :goto_1
    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->G:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->H:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->I:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/settings/notification/c$c$a$a;->J:Ljava/lang/Object;

    iput p1, v0, Lcom/whoop/settings/notification/c$c$a$a;->K:I

    iput v3, v0, Lcom/whoop/settings/notification/c$c$a$a;->x:I

    invoke-interface {v2, p2, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

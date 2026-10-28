.class public final Lxb0/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxb0/a$a;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
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

.field final synthetic x:Lxb0/a;


# direct methods
.method public constructor <init>(Lec3/m;Lxb0/a;)V
    .locals 0

    iput-object p1, p0, Lxb0/a$a$a;->w:Lec3/m;

    iput-object p2, p0, Lxb0/a$a$a;->x:Lxb0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lxb0/a$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxb0/a$a$a$a;

    iget v1, v0, Lxb0/a$a$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxb0/a$a$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxb0/a$a$a$a;

    invoke-direct {v0, p0, p2}, Lxb0/a$a$a$a;-><init>(Lxb0/a$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lxb0/a$a$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxb0/a$a$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lxb0/a$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lxb0/a$a$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lxb0/a$a$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lxb0/a$a$a;->w:Lec3/m;

    check-cast p1, Lub0/d;

    instance-of v2, p1, Lub0/d$c;

    if-eqz v2, :cond_3

    sget-object p1, Lwb0/i$c;->b:Lwb0/i$c;

    goto :goto_1

    :cond_3
    instance-of v2, p1, Lub0/d$b;

    if-eqz v2, :cond_4

    sget-object p1, Lwb0/i$b;->b:Lwb0/i$b;

    goto :goto_1

    :cond_4
    instance-of v2, p1, Lub0/d$e;

    if-eqz v2, :cond_5

    new-instance v2, Lwb0/i$e;

    check-cast p1, Lub0/d$e;

    invoke-virtual {p1}, Lub0/d$e;->a()Lub0/a;

    move-result-object v4

    invoke-virtual {v4}, Lub0/a;->a()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lub0/d$e;->a()Lub0/a;

    move-result-object v5

    invoke-virtual {v5}, Lub0/a;->b()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lub0/d$e;->a()Lub0/a;

    move-result-object v6

    invoke-virtual {v6}, Lub0/a;->c()Ljava/util/List;

    move-result-object v6

    invoke-virtual {p1}, Lub0/d$e;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v2, v4, v5, v6, p1}, Lwb0/i$e;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;)V

    move-object p1, v2

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lub0/d$a;

    if-eqz v2, :cond_6

    sget-object p1, Lwb0/i$a;->b:Lwb0/i$a;

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lub0/d$d;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lxb0/a$a$a;->x:Lxb0/a;

    check-cast p1, Lub0/d$d;

    invoke-virtual {p1}, Lub0/d$d;->a()Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    move-result-object v4

    invoke-virtual {p1}, Lub0/d$d;->b()Z

    move-result p1

    invoke-static {v2, v4, p1}, Lxb0/a;->b(Lxb0/a;Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Z)Lwb0/i$d;

    move-result-object p1

    :goto_1
    const/4 v2, 0x0

    iput-object v2, v0, Lxb0/a$a$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lxb0/a$a$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lxb0/a$a$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lxb0/a$a$a$a;->G:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lxb0/a$a$a$a;->H:I

    iput v3, v0, Lxb0/a$a$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    return-object v1

    :cond_7
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

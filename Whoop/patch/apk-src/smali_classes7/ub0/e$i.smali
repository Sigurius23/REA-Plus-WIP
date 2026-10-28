.class final Lub0/e$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lub0/e;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lub0/e$b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.advancedlabs.editbiomarkers.domain.EditBiomarkersInteractor$interact$1$1"
    f = "EditBiomarkersInteractor.kt"
    l = {
        0x2d,
        0x30,
        0x32,
        0x36,
        0x38,
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lub0/e;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lub0/c;


# direct methods
.method public constructor <init>(Lub0/c;Lub0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub0/c;",
            "Lub0/e;",
            "Lq83/d<",
            "-",
            "Lub0/e$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lub0/e$i;->z:Lub0/c;

    iput-object p2, p0, Lub0/e$i;->E:Lub0/e;

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

    new-instance v0, Lub0/e$i;

    iget-object v1, p0, Lub0/e$i;->z:Lub0/c;

    iget-object v2, p0, Lub0/e$i;->E:Lub0/e;

    invoke-direct {v0, v1, v2, p2}, Lub0/e$i;-><init>(Lub0/c;Lub0/e;Lq83/d;)V

    iput-object p1, v0, Lub0/e$i;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lub0/e$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lub0/e$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lub0/e$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lub0/e$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lub0/e$i;->y:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lub0/e$i;->x:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lub0/e$i;->w:Ljava/lang/Object;

    check-cast v0, Lub0/d;

    goto :goto_0

    :pswitch_1
    iget-object v2, p0, Lub0/e$i;->w:Ljava/lang/Object;

    check-cast v2, Lub0/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :goto_0
    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lub0/e$i;->z:Lub0/c;

    instance-of v2, p1, Lub0/c$c;

    if-eqz v2, :cond_5

    check-cast p1, Lub0/c$c;

    invoke-virtual {p1}, Lub0/c$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lub0/e$b$a;

    sget-object v2, Lub0/d$b;->a:Lub0/d$b;

    invoke-direct {p1, v2}, Lub0/e$b$a;-><init>(Lub0/d;)V

    iput-object v3, p0, Lub0/e$i;->y:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lub0/e$i;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto/16 :goto_6

    :cond_0
    iget-object p1, p0, Lub0/e$i;->z:Lub0/c;

    check-cast p1, Lub0/c$c;

    invoke-virtual {p1}, Lub0/c$c;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lub0/e$i;->E:Lub0/e;

    iget-object v2, p0, Lub0/e$i;->z:Lub0/c;

    check-cast v2, Lub0/c$c;

    invoke-virtual {v2}, Lub0/c$c;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v0, p0, Lub0/e$i;->y:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, p0, Lub0/e$i;->x:I

    invoke-static {p1, v2, p0}, Lub0/e;->h(Lub0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    check-cast p1, Lub0/d;

    :goto_2
    move-object v2, p1

    goto :goto_4

    :cond_2
    iget-object p1, p0, Lub0/e$i;->E:Lub0/e;

    iget-object v2, p0, Lub0/e$i;->z:Lub0/c;

    check-cast v2, Lub0/c$c;

    invoke-virtual {v2}, Lub0/c$c;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v0, p0, Lub0/e$i;->y:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p0, Lub0/e$i;->x:I

    invoke-static {p1, v2, p0}, Lub0/e;->i(Lub0/e;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_6

    :cond_3
    :goto_3
    check-cast p1, Lub0/d;

    goto :goto_2

    :goto_4
    instance-of p1, v2, Lub0/d$d;

    if-eqz p1, :cond_4

    new-instance p1, Lub0/e$b$b;

    move-object v4, v2

    check-cast v4, Lub0/d$d;

    invoke-virtual {v4}, Lub0/d$d;->a()Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;

    move-result-object v4

    iget-object v5, p0, Lub0/e$i;->z:Lub0/c;

    check-cast v5, Lub0/c$c;

    invoke-virtual {v5}, Lub0/c$c;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lub0/e$i;->z:Lub0/c;

    check-cast v6, Lub0/c$c;

    invoke-virtual {v6}, Lub0/c$c;->b()Z

    move-result v6

    invoke-direct {p1, v4, v5, v6}, Lub0/e$b$b;-><init>(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Ljava/lang/String;Z)V

    iput-object v0, p0, Lub0/e$i;->y:Ljava/lang/Object;

    iput-object v2, p0, Lub0/e$i;->w:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, p0, Lub0/e$i;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_6

    :cond_4
    :goto_5
    new-instance p1, Lub0/e$b$a;

    invoke-direct {p1, v2}, Lub0/e$b$a;-><init>(Lub0/d;)V

    iput-object v3, p0, Lub0/e$i;->y:Ljava/lang/Object;

    iput-object v3, p0, Lub0/e$i;->w:Ljava/lang/Object;

    const/4 v2, 0x5

    iput v2, p0, Lub0/e$i;->x:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_6

    :cond_5
    new-instance v2, Lub0/e$b$c;

    invoke-direct {v2, p1}, Lub0/e$b$c;-><init>(Lub0/c;)V

    iput-object v3, p0, Lub0/e$i;->y:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lub0/e$i;->x:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_6
    return-object v1

    :cond_6
    :goto_7
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

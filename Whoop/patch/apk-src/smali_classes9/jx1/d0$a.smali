.class final Ljx1/d0$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljx1/d0;->p(Llx1/e;)V
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.membership.management.presentation.MembershipManagementViewModel$sendViewEvent$1"
    f = "MembershipManagementViewModel.kt"
    l = {
        0x49,
        0x4a,
        0x4b,
        0x4c,
        0x4e,
        0x4f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Llx1/e;

.field final synthetic y:Ljx1/d0;


# direct methods
.method public constructor <init>(Llx1/e;Ljx1/d0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llx1/e;",
            "Ljx1/d0;",
            "Lq83/d<",
            "-",
            "Ljx1/d0$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljx1/d0$a;->x:Llx1/e;

    iput-object p2, p0, Ljx1/d0$a;->y:Ljx1/d0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Ljx1/d0$a;

    iget-object v0, p0, Ljx1/d0$a;->x:Llx1/e;

    iget-object v1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-direct {p1, v0, v1, p2}, Ljx1/d0$a;-><init>(Llx1/e;Ljx1/d0;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ljx1/d0$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljx1/d0$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljx1/d0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljx1/d0$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ljx1/d0$a;->w:I

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_0

    :pswitch_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ljx1/d0$a;->x:Llx1/e;

    instance-of v1, p1, Llx1/d;

    if-eqz v1, :cond_0

    iget-object p1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-static {p1}, Ljx1/d0;->n(Ljx1/d0;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Ljx1/d0$a;->x:Llx1/e;

    const/4 v2, 0x1

    iput v2, p0, Ljx1/d0$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto/16 :goto_1

    :cond_0
    instance-of v1, p1, Llx1/c;

    if-eqz v1, :cond_1

    iget-object p1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-static {p1}, Ljx1/d0;->l(Ljx1/d0;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Ljx1/d0$a;->x:Llx1/e;

    const/4 v2, 0x2

    iput v2, p0, Ljx1/d0$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_1
    instance-of v1, p1, Llx1/b;

    if-eqz v1, :cond_2

    iget-object p1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-static {p1}, Ljx1/d0;->j(Ljx1/d0;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Ljx1/d0$a;->x:Llx1/e;

    const/4 v2, 0x3

    iput v2, p0, Ljx1/d0$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_2
    instance-of v1, p1, Llx1/a$a;

    if-eqz v1, :cond_3

    iget-object p1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-static {p1}, Ljx1/d0;->g(Ljx1/d0;)Lec3/o1;

    move-result-object p1

    iget-object v1, p0, Ljx1/d0$a;->x:Llx1/e;

    const/4 v2, 0x4

    iput v2, p0, Ljx1/d0$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_3
    sget-object v1, Llx1/f;->a:Llx1/f;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-static {p1}, Ljx1/d0;->n(Ljx1/d0;)Lec3/o1;

    move-result-object p1

    sget-object v1, Llx1/d$c;->a:Llx1/d$c;

    const/4 v2, 0x5

    iput v2, p0, Ljx1/d0$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Ljx1/d0$a;->y:Ljx1/d0;

    invoke-static {p1}, Ljx1/d0;->j(Ljx1/d0;)Lec3/o1;

    move-result-object p1

    sget-object v1, Llx1/b$b;->a:Llx1/b$b;

    const/4 v2, 0x6

    iput v2, p0, Ljx1/d0$a;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

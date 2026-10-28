.class final Lcom/whoop/home/view/HomeFragment$e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$e$a$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ldm1/a;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldm1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/home/view/HomeFragment$e$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;

    iget v1, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/home/view/HomeFragment$e$a$a$a;-><init>(Lcom/whoop/home/view/HomeFragment$e$a$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ldm1/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/home/view/HomeFragment$e$a$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p2}, Lcom/whoop/home/view/HomeFragment;->z0(Lcom/whoop/home/view/HomeFragment;)Ltr2/n;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "observeNavigationState: Received event="

    invoke-static {v4, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {p2, v2, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/home/view/HomeFragment$e$a$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-static {p2}, Lcom/whoop/home/view/HomeFragment;->H0(Lcom/whoop/home/view/HomeFragment;)Lym2/g;

    move-result-object p2

    iput-object p1, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->w:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/home/view/HomeFragment$e$a$a$a;->z:I

    invoke-interface {p2, v0}, Lym2/g;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p2, p0, Lcom/whoop/home/view/HomeFragment$e$a$a;->w:Lcom/whoop/home/view/HomeFragment;

    invoke-virtual {p2, p1}, Lcom/whoop/home/view/HomeFragment;->x1(Ldm1/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldm1/a;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/home/view/HomeFragment$e$a$a;->b(Ldm1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.class final Lsy2/k$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsy2/k;->r(Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILqz0/c;ZILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.whooplabs.feature.campaignsteps.view.screens.MysticStepScreenKt$MysticReadingField$1$1"
    f = "MysticStepScreen.kt"
    l = {
        0xd8,
        0xd9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ly3/c;

.field w:I

.field final synthetic x:Lr0/a;

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Ll0/b2;


# direct methods
.method public constructor <init>(Lr0/a;Lp1/t2;Ll0/b2;Ly3/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr0/a;",
            "Lp1/t2;",
            "Ll0/b2;",
            "Ly3/c;",
            "Lq83/d<",
            "-",
            "Lsy2/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsy2/k$a;->x:Lr0/a;

    iput-object p2, p0, Lsy2/k$a;->y:Lp1/t2;

    iput-object p3, p0, Lsy2/k$a;->z:Ll0/b2;

    iput-object p4, p0, Lsy2/k$a;->E:Ly3/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ll0/b2;Ly3/c;)I
    .locals 0

    invoke-static {p0, p1}, Lsy2/k$a;->h(Ll0/b2;Ly3/c;)I

    move-result p0

    return p0
.end method

.method private static final h(Ll0/b2;Ly3/c;)I
    .locals 0

    invoke-interface {p0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lsy2/k$a;

    iget-object v1, p0, Lsy2/k$a;->x:Lr0/a;

    iget-object v2, p0, Lsy2/k$a;->y:Lp1/t2;

    iget-object v3, p0, Lsy2/k$a;->z:Ll0/b2;

    iget-object v4, p0, Lsy2/k$a;->E:Ly3/c;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsy2/k$a;-><init>(Lr0/a;Lp1/t2;Ll0/b2;Ly3/c;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lsy2/k$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsy2/k$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsy2/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsy2/k$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsy2/k$a;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsy2/k$a;->y:Lp1/t2;

    invoke-static {p1}, Lsy2/k;->v(Lp1/t2;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lsy2/k$a;->z:Ll0/b2;

    iget-object v1, p0, Lsy2/k$a;->E:Ly3/c;

    new-instance v5, Lsy2/j;

    const/4 v6, 0x0

    invoke-direct {v5, v6, p1, v1}, Lsy2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lsy2/k$a$a;

    invoke-direct {v1, p1}, Lsy2/k$a$a;-><init>(Lec3/l;)V

    iput v4, p0, Lsy2/k$a;->w:I

    invoke-static {v1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lsy2/k$a;->x:Lr0/a;

    iput v3, p0, Lsy2/k$a;->w:I

    invoke-static {p1, p0}, Lr0/a;->a(Lr0/a;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    return-object v2
.end method

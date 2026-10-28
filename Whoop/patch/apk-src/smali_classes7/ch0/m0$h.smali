.class final Lch0/m0$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch0/m0;->c0(Lf0/r1;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.ai.chat.view.AiChatScreenContentKt$OnKeyboardOpenScrollHandler$1$1"
    f = "AiChatScreenContent.kt"
    l = {
        0x19a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Z

.field final synthetic F:Lf0/r1;

.field w:I

.field final synthetic x:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic y:Ly3/c;

.field final synthetic z:Lg2/i;


# direct methods
.method public constructor <init>(Lp1/t2;Ly3/c;Lg2/i;ZLf0/r1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            "Ly3/c;",
            "Lg2/i;",
            "Z",
            "Lf0/r1;",
            "Lq83/d<",
            "-",
            "Lch0/m0$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch0/m0$h;->x:Lp1/t2;

    iput-object p2, p0, Lch0/m0$h;->y:Ly3/c;

    iput-object p3, p0, Lch0/m0$h;->z:Lg2/i;

    iput-boolean p4, p0, Lch0/m0$h;->E:Z

    iput-object p5, p0, Lch0/m0$h;->F:Lf0/r1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/t2;Ly3/c;)F
    .locals 0

    invoke-static {p0, p1}, Lch0/m0$h;->h(Lp1/t2;Ly3/c;)F

    move-result p0

    return p0
.end method

.method private static final h(Lp1/t2;Ly3/c;)F
    .locals 0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll0/b2;

    invoke-interface {p0, p1}, Ll0/b2;->c(Ly3/c;)I

    move-result p0

    int-to-float p0, p0

    return p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lch0/m0$h;

    iget-object v1, p0, Lch0/m0$h;->x:Lp1/t2;

    iget-object v2, p0, Lch0/m0$h;->y:Ly3/c;

    iget-object v3, p0, Lch0/m0$h;->z:Lg2/i;

    iget-boolean v4, p0, Lch0/m0$h;->E:Z

    iget-object v5, p0, Lch0/m0$h;->F:Lf0/r1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lch0/m0$h;-><init>(Lp1/t2;Ly3/c;Lg2/i;ZLf0/r1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lch0/m0$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lch0/m0$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lch0/m0$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lch0/m0$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lch0/m0$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lch0/m0$h;->x:Lp1/t2;

    iget-object v1, p0, Lch0/m0$h;->y:Ly3/c;

    new-instance v3, Lch0/m;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p1, v1}, Lch0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lch0/j1;

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v1, v4, v4, v3, v5}, Lch0/j1;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lch0/m0$h$a;

    invoke-direct {v3, v5}, Lch0/m0$h$a;-><init>(Lq83/d;)V

    new-instance v4, Lec3/l1;

    invoke-direct {v4, v1, p1, v3}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lch0/m0$h$c;

    invoke-direct {p1, v4}, Lch0/m0$h$c;-><init>(Lec3/l;)V

    new-instance v1, Lch0/m0$h$b;

    iget-object v3, p0, Lch0/m0$h;->z:Lg2/i;

    iget-boolean v4, p0, Lch0/m0$h;->E:Z

    iget-object v5, p0, Lch0/m0$h;->F:Lf0/r1;

    invoke-direct {v1, v3, v4, v5}, Lch0/m0$h$b;-><init>(Lg2/i;ZLf0/r1;)V

    iput v2, p0, Lch0/m0$h;->w:I

    invoke-interface {p1, v1, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

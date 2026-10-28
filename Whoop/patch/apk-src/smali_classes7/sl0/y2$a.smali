.class final Lsl0/y2$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/y2;->d(Lsl0/z2;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.SuggestionBubbleKt$SuggestionBubble$2$1"
    f = "SuggestionBubble.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:F

.field w:I

.field final synthetic x:Lsl0/z2;

.field final synthetic y:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic z:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsl0/z2;Lp1/t2;Lp1/t2;FLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/z2;",
            "Lp1/t2;",
            "Lp1/t2;",
            "F",
            "Lq83/d<",
            "-",
            "Lsl0/y2$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/y2$a;->x:Lsl0/z2;

    iput-object p2, p0, Lsl0/y2$a;->y:Lp1/t2;

    iput-object p3, p0, Lsl0/y2$a;->z:Lp1/t2;

    iput p4, p0, Lsl0/y2$a;->E:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lsl0/y2$a;->h(Lp1/t2;)F

    move-result p0

    return p0
.end method

.method private static final h(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lsl0/y2;->j(Lp1/t2;)F

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

    new-instance v0, Lsl0/y2$a;

    iget-object v1, p0, Lsl0/y2$a;->x:Lsl0/z2;

    iget-object v2, p0, Lsl0/y2$a;->y:Lp1/t2;

    iget-object v3, p0, Lsl0/y2$a;->z:Lp1/t2;

    iget v4, p0, Lsl0/y2$a;->E:F

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lsl0/y2$a;-><init>(Lsl0/z2;Lp1/t2;Lp1/t2;FLq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsl0/y2$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/y2$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/y2$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/y2$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lsl0/y2$a;->w:I

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

    iget-object p1, p0, Lsl0/y2$a;->x:Lsl0/z2;

    invoke-virtual {p1}, Lsl0/z2;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lsl0/y2$a;->y:Lp1/t2;

    invoke-static {p1}, Lsl0/y2;->k(Lp1/t2;)Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lsl0/y2$a;->z:Lp1/t2;

    new-instance v1, Lsl0/v0;

    const/4 v3, 0x1

    invoke-direct {v1, p1, v3}, Lsl0/v0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v1, Lsl0/y2$a$a;

    iget v3, p0, Lsl0/y2$a;->E:F

    const/4 v4, 0x0

    invoke-direct {v1, v3, v4}, Lsl0/y2$a$a;-><init>(FLq83/d;)V

    iput v2, p0, Lsl0/y2$a;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->B(Lec3/l;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lsl0/y2$a;->y:Lp1/t2;

    invoke-static {p1}, Lsl0/y2;->k(Lp1/t2;)Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

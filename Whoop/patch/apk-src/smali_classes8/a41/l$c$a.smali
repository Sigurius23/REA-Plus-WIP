.class final La41/l$c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La41/l$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$TestimonialsAutoscrollEffect$2$1$1"
    f = "Testimonials.kt"
    l = {
        0xa5
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lq0/y;

.field final synthetic z:I


# direct methods
.method public constructor <init>(Lq0/y;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq0/y;",
            "I",
            "Lq83/d<",
            "-",
            "La41/l$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La41/l$c$a;->y:Lq0/y;

    iput p2, p0, La41/l$c$a;->z:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lq0/y;)I
    .locals 0

    invoke-static {p0}, La41/l$c$a;->h(Lq0/y;)I

    move-result p0

    return p0
.end method

.method private static final h(Lq0/y;)I
    .locals 0

    invoke-virtual {p0}, Lq0/y;->p()I

    move-result p0

    return p0
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

    new-instance v0, La41/l$c$a;

    iget-object v1, p0, La41/l$c$a;->y:Lq0/y;

    iget v2, p0, La41/l$c$a;->z:I

    invoke-direct {v0, v1, v2, p2}, La41/l$c$a;-><init>(Lq0/y;ILq83/d;)V

    iput-object p1, v0, La41/l$c$a;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La41/l$c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La41/l$c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La41/l$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La41/l$c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, La41/l$c$a;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La41/l$c$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La41/l$c$a;->y:Lq0/y;

    new-instance v2, La41/k;

    const/4 v4, 0x1

    invoke-direct {v2, p1, v4}, La41/k;-><init>(Lq0/y;I)V

    invoke-static {v2}, Lp1/x;->H(Lc93/a;)Lec3/s1;

    move-result-object p1

    new-instance v2, La41/l$c$a$a;

    iget-object v4, p0, La41/l$c$a;->y:Lq0/y;

    iget v5, p0, La41/l$c$a;->z:I

    const/4 v6, 0x0

    invoke-direct {v2, v4, v5, v0, v6}, La41/l$c$a$a;-><init>(Lq0/y;ILbc3/c0;Lq83/d;)V

    iput-object v6, p0, La41/l$c$a;->x:Ljava/lang/Object;

    iput v3, p0, La41/l$c$a;->w:I

    invoke-static {p1, v2, p0}, Lec3/v;->n(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

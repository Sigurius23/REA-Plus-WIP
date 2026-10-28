.class final La41/l$c$a$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La41/l$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(I)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.design.atomic.molecule.testimonials.TestimonialsKt$TestimonialsAutoscrollEffect$2$1$1$2"
    f = "Testimonials.kt"
    l = {
        0xa6
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lq0/y;

.field final synthetic y:I

.field final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lq0/y;ILbc3/c0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq0/y;",
            "I",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "La41/l$c$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La41/l$c$a$a;->x:Lq0/y;

    iput p2, p0, La41/l$c$a$a;->y:I

    iput-object p3, p0, La41/l$c$a$a;->z:Lbc3/c0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, La41/l$c$a$a;

    iget-object v0, p0, La41/l$c$a$a;->x:Lq0/y;

    iget v1, p0, La41/l$c$a$a;->y:I

    iget-object v2, p0, La41/l$c$a$a;->z:Lbc3/c0;

    invoke-direct {p1, v0, v1, v2, p2}, La41/l$c$a$a;-><init>(Lq0/y;ILbc3/c0;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, La41/l$c$a$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La41/l$c$a$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La41/l$c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La41/l$c$a$a;->invoke(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, La41/l$c$a$a;->w:I

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

    iput v2, p0, La41/l$c$a$a;->w:I

    const-wide/16 v3, 0x1388

    invoke-static {v3, v4, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, La41/l$c$a$a;->x:Lq0/y;

    invoke-virtual {p1}, Lq0/y;->p()I

    move-result p1

    add-int/2addr p1, v2

    iget v0, p0, La41/l$c$a$a;->y:I

    rem-int/2addr p1, v0

    iget-object v0, p0, La41/l$c$a$a;->z:Lbc3/c0;

    new-instance v1, La41/l$c$a$a$a;

    iget-object v2, p0, La41/l$c$a$a;->x:Lq0/y;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, La41/l$c$a$a$a;-><init>(Lq0/y;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v3, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.class final Lwl0/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwl0/a;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.cyclingtextview.CyclingTextViewKt$ShimmerText$1$1"
    f = "CyclingTextView.kt"
    l = {
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field x:I

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lp1/a1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lp1/a1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lp1/a1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lwl0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwl0/a$b;->y:Ljava/lang/String;

    iput-object p2, p0, Lwl0/a$b;->z:Lp1/a1;

    iput-object p3, p0, Lwl0/a$b;->E:Lp1/c1;

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

    new-instance p1, Lwl0/a$b;

    iget-object v0, p0, Lwl0/a$b;->y:Ljava/lang/String;

    iget-object v1, p0, Lwl0/a$b;->z:Lp1/a1;

    iget-object v2, p0, Lwl0/a$b;->E:Lp1/c1;

    invoke-direct {p1, v0, v1, v2, p2}, Lwl0/a$b;-><init>(Ljava/lang/String;Lp1/a1;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lwl0/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lwl0/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lwl0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lwl0/a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lwl0/a$b;->x:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    iget v1, p0, Lwl0/a$b;->w:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lwl0/a$b;->z:Lp1/a1;

    invoke-static {p1, v2}, Lwl0/a;->w(Lp1/a1;I)V

    iget-object p1, p0, Lwl0/a$b;->E:Lp1/c1;

    const-string v1, ""

    invoke-static {p1, v1}, Lwl0/a;->x(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lwl0/a$b;->y:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v1, 0x3e8

    div-int/2addr v1, p1

    :cond_2
    :goto_0
    iget-object p1, p0, Lwl0/a$b;->z:Lp1/a1;

    invoke-static {p1}, Lwl0/a;->v(Lp1/a1;)I

    move-result p1

    iget-object v4, p0, Lwl0/a$b;->y:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-ge p1, v4, :cond_3

    iget-object p1, p0, Lwl0/a$b;->E:Lp1/c1;

    iget-object v4, p0, Lwl0/a$b;->y:Ljava/lang/String;

    iget-object v5, p0, Lwl0/a$b;->z:Lp1/a1;

    invoke-static {v5}, Lwl0/a;->v(Lp1/a1;)I

    move-result v5

    add-int/2addr v5, v3

    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v5, "substring(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v4}, Lwl0/a;->x(Lp1/c1;Ljava/lang/String;)V

    iget-object p1, p0, Lwl0/a$b;->z:Lp1/a1;

    invoke-static {p1}, Lwl0/a;->v(Lp1/a1;)I

    move-result p1

    iget-object v4, p0, Lwl0/a$b;->z:Lp1/a1;

    add-int/2addr p1, v3

    invoke-static {v4, p1}, Lwl0/a;->w(Lp1/a1;I)V

    int-to-long v4, v1

    iput v1, p0, Lwl0/a$b;->w:I

    iput v3, p0, Lwl0/a$b;->x:I

    invoke-static {v4, v5, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

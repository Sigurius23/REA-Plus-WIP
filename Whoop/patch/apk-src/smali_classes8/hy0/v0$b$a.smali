.class final Lhy0/v0$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhy0/v0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Ln0/u;

.field final synthetic x:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/u;Lkotlin/jvm/internal/g0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln0/u;",
            "Lkotlin/jvm/internal/g0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lhy0/v0$b$a;->w:Ln0/u;

    iput-object p2, p0, Lhy0/v0$b$a;->x:Lkotlin/jvm/internal/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lhy0/v0$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lhy0/v0$b$a$a;

    iget v1, v0, Lhy0/v0$b$a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lhy0/v0$b$a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lhy0/v0$b$a$a;

    invoke-direct {v0, p0, p2}, Lhy0/v0$b$a$a;-><init>(Lhy0/v0$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lhy0/v0$b$a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lhy0/v0$b$a$a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lhy0/v0$b$a$a;->w:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lhy0/v0$b$a;->w:Ln0/u;

    iget-object p2, p2, Ln0/u;->e:Ll2/a;

    iget-object p2, p2, Ll2/a;->b:Ljava/lang/Object;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    const/4 v2, 0x0

    if-gtz p2, :cond_4

    iget-object p2, p0, Lhy0/v0$b$a;->w:Ln0/u;

    iget-object p2, p2, Ln0/u;->e:Ll2/a;

    iget-object p2, p2, Ll2/a;->c:Ljava/lang/Object;

    check-cast p2, Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    if-lez p2, :cond_3

    goto :goto_1

    :cond_3
    move p2, v2

    goto :goto_2

    :cond_4
    :goto_1
    move p2, v3

    :goto_2
    iget-object v4, p0, Lhy0/v0$b$a;->x:Lkotlin/jvm/internal/g0;

    iget-object v4, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    if-eqz p2, :cond_5

    iget-object v4, p0, Lhy0/v0$b$a;->w:Ln0/u;

    iput-object p1, v0, Lhy0/v0$b$a$a;->w:Ljava/lang/Object;

    iput p2, v0, Lhy0/v0$b$a$a;->x:I

    iput v3, v0, Lhy0/v0$b$a$a;->E:I

    invoke-virtual {v4, v2, v2, v0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    return-object v1

    :cond_5
    :goto_3
    iget-object p2, p0, Lhy0/v0$b$a;->x:Lkotlin/jvm/internal/g0;

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

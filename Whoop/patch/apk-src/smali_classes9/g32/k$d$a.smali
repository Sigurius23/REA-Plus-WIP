.class final Lg32/k$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg32/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic x:Le32/e;

.field final synthetic y:Lg32/m;

.field final synthetic z:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Le32/e;Lg32/m;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Le32/e;",
            "Lg32/m;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lg32/k$d$a;->x:Le32/e;

    iput-object p3, p0, Lg32/k$d$a;->y:Lg32/m;

    iput-object p4, p0, Lg32/k$d$a;->z:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Le32/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le32/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Le32/c;->a()Le32/b;

    move-result-object p1

    instance-of p2, p1, Le32/b$b;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance v0, Le32/d$c;

    check-cast p1, Le32/b$b;

    invoke-virtual {p1}, Le32/b$b;->a()Lb32/a;

    move-result-object v1

    invoke-virtual {p1}, Le32/b$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Le32/d$c;-><init>(Lb32/a;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    goto/16 :goto_0

    :cond_0
    instance-of p2, p1, Le32/b$a;

    if-eqz p2, :cond_1

    iget-object p1, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    sget-object p2, Le32/d$b;->a:Le32/d$b;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    goto/16 :goto_0

    :cond_1
    instance-of p2, p1, Le32/b$c;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance v0, Le32/d$d;

    check-cast p1, Le32/b$c;

    invoke-virtual {p1}, Le32/b$c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Le32/d$d;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    goto :goto_0

    :cond_2
    instance-of p2, p1, Le32/b$h;

    if-eqz p2, :cond_3

    iget-object p1, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    sget-object p2, Le32/d$g;->a:Le32/d$g;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    goto :goto_0

    :cond_3
    instance-of p2, p1, Le32/b$g;

    if-eqz p2, :cond_4

    iget-object p2, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance v0, Le32/d$f;

    check-cast p1, Le32/b$g;

    invoke-virtual {p1}, Le32/b$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Le32/d$f;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    goto :goto_0

    :cond_4
    instance-of p2, p1, Le32/b$f;

    if-eqz p2, :cond_5

    iget-object p2, p0, Lg32/k$d$a;->w:Lkotlin/jvm/functions/Function1;

    new-instance v0, Le32/d$e;

    check-cast p1, Le32/b$f;

    invoke-virtual {p1}, Le32/b$f;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {v0, p1}, Le32/d$e;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    goto :goto_0

    :cond_5
    instance-of p2, p1, Le32/b$e;

    if-eqz p2, :cond_6

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    invoke-virtual {p1}, Le32/e;->r()V

    iget-object p1, p0, Lg32/k$d$a;->x:Le32/e;

    iget-object p2, p0, Lg32/k$d$a;->y:Lg32/m;

    invoke-virtual {p2}, Lg32/m;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Le32/e;->p(Ljava/lang/String;)V

    iget-object p1, p0, Lg32/k$d$a;->z:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_6
    instance-of p1, p1, Le32/b$d;

    if-eqz p1, :cond_7

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le32/c;

    invoke-virtual {p0, p1, p2}, Lg32/k$d$a;->b(Le32/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

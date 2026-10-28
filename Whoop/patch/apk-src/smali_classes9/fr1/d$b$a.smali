.class final Lfr1/d$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr1/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lfr1/d;

.field final synthetic x:Ljava/lang/String;

.field final synthetic y:Z


# direct methods
.method public constructor <init>(Lfr1/d;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lfr1/d$b$a;->w:Lfr1/d;

    iput-object p2, p0, Lfr1/d$b$a;->x:Ljava/lang/String;

    iput-boolean p3, p0, Lfr1/d$b$a;->y:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lg12/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg12/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lg12/c$d;->a:Lg12/c$d;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lfr1/d$b$a;->w:Lfr1/d;

    invoke-static {p1}, Lfr1/d;->f(Lfr1/d;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lgr1/n$j;

    iget-object v0, p0, Lfr1/d$b$a;->x:Ljava/lang/String;

    invoke-direct {p2, v0}, Lgr1/n$j;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p2, Lg12/c$c;->a:Lg12/c$c;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p1, p0, Lfr1/d$b$a;->x:Ljava/lang/String;

    const-string p2, "healthex"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lfr1/d$b$a;->w:Lfr1/d;

    invoke-static {p1}, Lfr1/d;->c(Lfr1/d;)Lbc3/c0;

    move-result-object p1

    new-instance p2, Lfr1/d$b$a$a;

    iget-object v0, p0, Lfr1/d$b$a;->w:Lfr1/d;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v1}, Lfr1/d$b$a$a;-><init>(Lfr1/d;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {p1, v1, v1, p2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    iget-object p1, p0, Lfr1/d$b$a;->w:Lfr1/d;

    invoke-static {p1}, Lfr1/d;->f(Lfr1/d;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lgr1/n$k;

    iget-object v0, p0, Lfr1/d$b$a;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lfr1/d$b$a;->y:Z

    invoke-direct {p2, v0, v1}, Lgr1/n$k;-><init>(Ljava/lang/String;Z)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object p2, Lg12/c$b;->a:Lg12/c$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p1, p0, Lfr1/d$b$a;->w:Lfr1/d;

    invoke-static {p1}, Lfr1/d;->f(Lfr1/d;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lgr1/n$i;

    iget-object v0, p0, Lfr1/d$b$a;->x:Ljava/lang/String;

    invoke-direct {p2, v0}, Lgr1/n$i;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    sget-object p2, Lg12/c$a;->a:Lg12/c$a;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg12/c;

    invoke-virtual {p0, p1, p2}, Lfr1/d$b$a;->b(Lg12/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

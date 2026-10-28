.class final Lyb2/b$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyb2/b;->h(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lyb2/a;",
        "prevState",
        "Lfc2/c;",
        "event",
        "<anonymous>",
        "(Lyb2/a;Lfc2/c;)Lyb2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.language.domain.LanguagePrefsInteractor$interact$1"
    f = "LanguagePrefsInteractor.kt"
    l = {
        0x2d,
        0x2e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lyb2/b;


# direct methods
.method public constructor <init>(Lyb2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyb2/b;",
            "Lq83/d<",
            "-",
            "Lyb2/b$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyb2/b$c;->z:Lyb2/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lyb2/a;Lfc2/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyb2/a;",
            "Lfc2/c;",
            "Lq83/d<",
            "-",
            "Lyb2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lyb2/b$c;

    iget-object v1, p0, Lyb2/b$c;->z:Lyb2/b;

    invoke-direct {v0, v1, p3}, Lyb2/b$c;-><init>(Lyb2/b;Lq83/d;)V

    iput-object p1, v0, Lyb2/b$c;->x:Ljava/lang/Object;

    iput-object p2, v0, Lyb2/b$c;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lyb2/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyb2/a;

    check-cast p2, Lfc2/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lyb2/b$c;->f(Lyb2/a;Lfc2/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lyb2/b$c;->x:Ljava/lang/Object;

    check-cast v0, Lyb2/a;

    iget-object v1, p0, Lyb2/b$c;->y:Ljava/lang/Object;

    check-cast v1, Lfc2/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lyb2/b$c;->w:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

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

    instance-of p1, v1, Lfc2/c$a;

    const/4 v3, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lyb2/b$c;->z:Lyb2/b;

    check-cast v1, Lfc2/c$a;

    invoke-virtual {v1}, Lfc2/c$a;->a()Ljava/lang/String;

    move-result-object v1

    iput-object v3, p0, Lyb2/b$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lyb2/b$c;->y:Ljava/lang/Object;

    iput v5, p0, Lyb2/b$c;->w:I

    invoke-static {p1, v0, v1, p0}, Lyb2/b;->a(Lyb2/b;Lyb2/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lyb2/a;

    return-object p1

    :cond_4
    sget-object p1, Lfc2/c$b;->a:Lfc2/c$b;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lyb2/b$c;->z:Lyb2/b;

    iput-object v3, p0, Lyb2/b$c;->x:Ljava/lang/Object;

    iput-object v3, p0, Lyb2/b$c;->y:Ljava/lang/Object;

    iput v4, p0, Lyb2/b$c;->w:I

    invoke-static {p1, p0}, Lyb2/b;->b(Lyb2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    :goto_1
    return-object v2

    :cond_5
    :goto_2
    check-cast p1, Lyb2/a;

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

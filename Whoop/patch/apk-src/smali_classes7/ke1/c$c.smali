.class final Lke1/c$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lke1/c;->f(Lec3/l;)Lec3/l;
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
        "Lke1/b;",
        "<unused var>",
        "Lke1/a;",
        "domainAction",
        "<anonymous>",
        "(Lke1/b;Lke1/a;)Lke1/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.education.domain.EducationInteractor$interact$1"
    f = "EducationInteractor.kt"
    l = {
        0x19
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lke1/c;


# direct methods
.method public constructor <init>(Lke1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke1/c;",
            "Lq83/d<",
            "-",
            "Lke1/c$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lke1/c$c;->y:Lke1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lke1/b;Lke1/a;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lke1/b;",
            "Lke1/a;",
            "Lq83/d<",
            "-",
            "Lke1/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Lke1/c$c;

    iget-object v0, p0, Lke1/c$c;->y:Lke1/c;

    invoke-direct {p1, v0, p3}, Lke1/c$c;-><init>(Lke1/c;Lq83/d;)V

    iput-object p2, p1, Lke1/c$c;->x:Ljava/lang/Object;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lke1/c$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lke1/b;

    check-cast p2, Lke1/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lke1/c$c;->f(Lke1/b;Lke1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lke1/c$c;->x:Ljava/lang/Object;

    check-cast v0, Lke1/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lke1/c$c;->w:I

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

    instance-of p1, v0, Lke1/a$a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lke1/c$c;->y:Lke1/c;

    check-cast v0, Lke1/a$a;

    invoke-virtual {v0}, Lke1/a$a;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    iput-object v2, p0, Lke1/c$c;->x:Ljava/lang/Object;

    iput v3, p0, Lke1/c$c;->w:I

    invoke-static {p1, v0, p0}, Lke1/c;->a(Lke1/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    check-cast p1, Lke1/b;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

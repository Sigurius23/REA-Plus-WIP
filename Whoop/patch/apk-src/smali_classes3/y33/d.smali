.class public final Ly33/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/g0;


# virtual methods
.method public final intercept(Lud3/f0;)Lud3/x0;
    .locals 3

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lae3/i;

    iget-object v0, p1, Lae3/i;->e:Lud3/o0;

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object v0

    const-string v1, "X-Stream-Client"

    invoke-static {}, Lx33/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lud3/o0;

    invoke-direct {v1, v0}, Lud3/o0;-><init>(Lud3/n0;)V

    invoke-virtual {p1, v1}, Lae3/i;->b(Lud3/o0;)Lud3/x0;

    move-result-object p1

    return-object p1
.end method

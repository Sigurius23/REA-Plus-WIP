.class public final Lab3/v;
.super Lab3/g;
.source "SourceFile"


# virtual methods
.method public final a(Lr93/b0;)Llb3/y;
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lr93/b0;->c()Lo93/h;

    move-result-object p1

    invoke-virtual {p1}, Lo93/h;->o()Llb3/c0;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/16 p1, 0x32

    invoke-static {p1}, Lo93/h;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

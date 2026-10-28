.class public final La6/r0;
.super La6/k0;
.source "SourceFile"

# interfaces
.implements La6/l1;


# virtual methods
.method public final d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La6/k0;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, La6/f0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, La6/f0;-><init>(La6/r0;Ljava/lang/Object;Lq83/d;)V

    check-cast p2, Ls83/c;

    iget-object p1, p0, La6/k0;->a:Ljava/io/File;

    invoke-static {p1, v0, p2}, Lhg3/i;->m(Ljava/io/File;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This scope has already been closed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

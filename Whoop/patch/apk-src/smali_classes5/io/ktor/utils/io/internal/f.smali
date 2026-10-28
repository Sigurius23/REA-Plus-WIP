.class public final Lio/ktor/utils/io/internal/f;
.super Lx63/d;
.source "SourceFile"


# virtual methods
.method public final k(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lio/ktor/utils/io/internal/j;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/ktor/utils/io/internal/g;->b:Lx63/e;

    iget-object p1, p1, Lio/ktor/utils/io/internal/m;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Lx63/d;->a1(Ljava/lang/Object;)V

    return-void
.end method

.method public final m()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lio/ktor/utils/io/internal/j;

    sget-object v1, Lio/ktor/utils/io/internal/g;->b:Lx63/e;

    invoke-virtual {v1}, Lx63/d;->t0()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio/ktor/utils/io/internal/j;-><init>(Ljava/nio/ByteBuffer;I)V

    return-object v0
.end method

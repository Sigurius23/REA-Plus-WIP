.class public final Lio/ktor/utils/io/l;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/ktor/utils/io/m;


# direct methods
.method public synthetic constructor <init>(Lio/ktor/utils/io/m;I)V
    .locals 0

    iput p2, p0, Lio/ktor/utils/io/l;->w:I

    iput-object p1, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lio/ktor/utils/io/l;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    iget-object v0, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-static {v0}, Lio/ktor/utils/io/m;->c(Lio/ktor/utils/io/m;)V

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lse/b;->f0(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/ktor/utils/io/m;->i(Ljava/lang/Throwable;)Z

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lq83/d;

    const-string v0, "ucont"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-static {v0}, Lio/ktor/utils/io/m;->b(Lio/ktor/utils/io/m;)I

    move-result v0

    :cond_1
    :goto_1
    iget-object v1, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-static {v1}, Lio/ktor/utils/io/m;->a(Lio/ktor/utils/io/m;)Lio/ktor/utils/io/internal/c;

    move-result-object v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-virtual {v1, v0}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, v1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-static {p1}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v2

    iget-object v3, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    :cond_3
    iget-object v4, v1, Lio/ktor/utils/io/m;->_writeOp:Ljava/lang/Object;

    check-cast v4, Lq83/d;

    if-nez v4, :cond_6

    invoke-virtual {v3, v0}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    sget-object v4, Lio/ktor/utils/io/m;->m:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-static {v4, v1, v2}, Lhc3/i;->y(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Lq83/d;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v3, v0}, Lio/ktor/utils/io/m;->R(I)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-static {v4, v1, v2}, Lhc3/i;->z(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/lang/Object;Lq83/d;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_5
    :goto_2
    iget-object p1, p0, Lio/ktor/utils/io/l;->x:Lio/ktor/utils/io/m;

    invoke-virtual {p1, v0}, Lio/ktor/utils/io/m;->k(I)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Operation is already in progress"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-virtual {v1}, Lio/ktor/utils/io/internal/c;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Ls2/e;->l(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

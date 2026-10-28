.class public final Lio/ktor/utils/io/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx63/f;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/ktor/utils/io/internal/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()V
    .locals 0

    return-void
.end method

.method private final h()V
    .locals 0

    return-void
.end method


# virtual methods
.method public a1(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lio/ktor/utils/io/internal/e;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lw63/a;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv63/a;->a:Lv63/f;

    invoke-virtual {v0, p1}, Lx63/d;->a1(Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p1, Lw63/a;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lw63/a;->m:Lw63/a;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only ChunkBuffer.Empty instance could be recycled."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget v0, p0, Lio/ktor/utils/io/internal/e;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Ls4/l;->h(Lx63/f;)V

    return-void

    :pswitch_0
    invoke-static {p0}, Ls4/l;->h(Lx63/f;)V

    return-void

    :pswitch_1
    invoke-static {p0}, Ls4/l;->h(Lx63/f;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final dispose()V
    .locals 1

    iget v0, p0, Lio/ktor/utils/io/internal/e;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lv63/a;->a:Lv63/f;

    invoke-virtual {v0}, Lx63/d;->dispose()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final t0()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lio/ktor/utils/io/internal/e;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lv63/a;->a:Lv63/f;

    invoke-virtual {v0}, Lx63/d;->t0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw63/a;

    return-object v0

    :pswitch_0
    sget-object v0, Lw63/a;->m:Lw63/a;

    return-object v0

    :pswitch_1
    new-instance v0, Lio/ktor/utils/io/internal/j;

    sget v1, Lio/ktor/utils/io/internal/g;->a:I

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const-string v2, "allocateDirect(BUFFER_SIZE)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lio/ktor/utils/io/internal/j;-><init>(Ljava/nio/ByteBuffer;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

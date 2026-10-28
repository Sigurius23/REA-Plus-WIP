.class public final Lc0/a1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc0/b1;


# direct methods
.method public synthetic constructor <init>(Lc0/b1;I)V
    .locals 0

    iput p2, p0, Lc0/a1;->w:I

    iput-object p1, p0, Lc0/a1;->x:Lc0/b1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lc0/a1;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld0/t1;

    sget-object v0, Lc0/q0;->w:Lc0/q0;

    sget-object v1, Lc0/q0;->x:Lc0/q0;

    invoke-interface {p1, v0, v1}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    iget-object v2, p0, Lc0/a1;->x:Lc0/b1;

    if-eqz v0, :cond_1

    iget-object p1, v2, Lc0/b1;->T:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->b:Lc0/s1;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lc0/s1;->b:Ld0/c0;

    if-nez p1, :cond_4

    :cond_0
    sget-object p1, Lc0/w0;->c:Ld0/i1;

    goto :goto_0

    :cond_1
    sget-object v0, Lc0/q0;->y:Lc0/q0;

    invoke-interface {p1, v1, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, v2, Lc0/b1;->U:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->b:Lc0/s1;

    if-eqz p1, :cond_2

    iget-object p1, p1, Lc0/s1;->b:Ld0/c0;

    if-nez p1, :cond_4

    :cond_2
    sget-object p1, Lc0/w0;->c:Ld0/i1;

    goto :goto_0

    :cond_3
    sget-object p1, Lc0/w0;->c:Ld0/i1;

    :cond_4
    :goto_0
    return-object p1

    :pswitch_0
    check-cast p1, Ld0/t1;

    sget-object v0, Lc0/q0;->w:Lc0/q0;

    sget-object v1, Lc0/q0;->x:Lc0/q0;

    invoke-interface {p1, v0, v1}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    iget-object v3, p0, Lc0/a1;->x:Lc0/b1;

    if-eqz v0, :cond_5

    iget-object p1, v3, Lc0/b1;->T:Lc0/c1;

    check-cast p1, Lc0/d1;

    iget-object p1, p1, Lc0/d1;->b:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->c:Lc0/k0;

    if-eqz p1, :cond_7

    iget-object v2, p1, Lc0/k0;->c:Ld0/c0;

    goto :goto_1

    :cond_5
    sget-object v0, Lc0/q0;->y:Lc0/q0;

    invoke-interface {p1, v1, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, v3, Lc0/b1;->U:Lc0/e1;

    check-cast p1, Lc0/f1;

    iget-object p1, p1, Lc0/f1;->c:Lc0/u1;

    iget-object p1, p1, Lc0/u1;->c:Lc0/k0;

    if-eqz p1, :cond_7

    iget-object v2, p1, Lc0/k0;->c:Ld0/c0;

    goto :goto_1

    :cond_6
    sget-object v2, Lc0/w0;->d:Ld0/i1;

    :cond_7
    :goto_1
    if-nez v2, :cond_8

    sget-object v2, Lc0/w0;->d:Ld0/i1;

    :cond_8
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

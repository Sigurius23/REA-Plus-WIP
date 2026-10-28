.class public final Ld30/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld30/h;


# direct methods
.method public synthetic constructor <init>(Ld30/h;I)V
    .locals 0

    iput p2, p0, Ld30/d;->w:I

    iput-object p1, p0, Ld30/d;->x:Ld30/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    iget p2, p0, Ld30/d;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ld30/d;->x:Ld30/h;

    iget-object p2, p1, Ld30/h;->i:Ljava/lang/Object;

    check-cast p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p1, p1, Ld30/h;->g:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ld30/x;

    iget-boolean p2, p1, Ld30/x;->c:Z

    iget-object v0, p1, Ld30/x;->a:Ljava/util/List;

    if-nez p2, :cond_1

    iget-boolean p1, p1, Ld30/x;->d:Z

    if-nez p1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/l;

    iget-object v0, p0, Ld30/d;->x:Ld30/h;

    iget-object v1, v0, Ld30/h;->e:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, v0, Ld30/h;->i:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, v0, Ld30/h;->g:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

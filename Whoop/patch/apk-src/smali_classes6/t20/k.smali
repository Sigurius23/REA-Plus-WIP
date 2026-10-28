.class public final Lt20/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt20/n;


# direct methods
.method public synthetic constructor <init>(Lt20/n;I)V
    .locals 0

    iput p2, p0, Lt20/k;->w:I

    iput-object p1, p0, Lt20/k;->x:Lt20/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2

    iget p2, p0, Lt20/k;->w:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lt20/u;

    iget-object p2, p0, Lt20/k;->x:Lt20/n;

    iget-object p2, p2, Lt20/n;->n:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object p2, p0, Lt20/k;->x:Lt20/n;

    iget-object p2, p2, Lt20/n;->q:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lb30/x4;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lb30/x4;-><init>(ZI)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    check-cast p1, Lq20/s;

    iget-object p2, p0, Lt20/k;->x:Lt20/n;

    iget-object p2, p2, Lt20/n;->p:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

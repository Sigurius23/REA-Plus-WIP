.class public final synthetic Lw41/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lw41/l;->w:I

    iput-object p1, p0, Lw41/l;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lw41/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lw41/w;

    check-cast p1, Leu/g;

    invoke-static {v0, p1}, Lw41/a;->c(Lw41/w;Leu/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {v0, p1}, Lw41/k;->i(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {v0, p1}, Lw41/k;->j(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lw41/k;->a(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lw41/k;->g(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {v0, p1}, Lw41/k$c;->h(Lp1/c1;Lcom/google/android/gms/maps/model/LatLngBounds;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lw41/k$c;->f(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lw41/l;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lw41/k$c;->i(Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

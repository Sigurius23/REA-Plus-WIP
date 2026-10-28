.class public final synthetic Lw71/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lw71/y;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lw71/y;I)V
    .locals 0

    iput p3, p0, Lw71/g;->w:I

    iput-object p1, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lw71/g;->y:Lw71/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lw71/g;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw71/g;->y:Lw71/y;

    invoke-static {v0, v1, p1}, Lw71/l;->g(Lkotlin/jvm/functions/Function1;Lw71/y;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lw71/g;->y:Lw71/y;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lw71/l;->h(Lkotlin/jvm/functions/Function1;Lw71/y;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lw71/g;->y:Lw71/y;

    invoke-static {p1, v2, v0, v1}, Lw71/l;->e(Lkotlin/jvm/functions/Function1;Lw71/y;J)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw71/g;->y:Lw71/y;

    invoke-static {v0, v1, p1}, Lw71/l;->u(Lkotlin/jvm/functions/Function1;Lw71/y;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw71/g;->y:Lw71/y;

    invoke-static {v0, v1, p1}, Lw71/l;->l(Lkotlin/jvm/functions/Function1;Lw71/y;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw71/g;->y:Lw71/y;

    invoke-static {v0, v1, p1}, Lw71/l;->s(Lkotlin/jvm/functions/Function1;Lw71/y;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lw71/g;->y:Lw71/y;

    check-cast p1, Ljava/lang/Double;

    iget-object v1, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lw71/l;->i(Lkotlin/jvm/functions/Function1;Lw71/y;Ljava/lang/Double;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw71/g;->y:Lw71/y;

    invoke-static {v0, v1, p1}, Lw71/l;->j(Lkotlin/jvm/functions/Function1;Lw71/y;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lw71/g;->y:Lw71/y;

    check-cast p1, Ljava/lang/Boolean;

    iget-object v1, p0, Lw71/g;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lw71/l;->n(Lkotlin/jvm/functions/Function1;Lw71/y;Ljava/lang/Boolean;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

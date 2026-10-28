.class public final synthetic Liw0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Liw0/o;->w:I

    iput-object p1, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Liw0/o;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/c0;->c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->a0(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->M(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->b(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->S(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->r(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Liw0/o;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Liw0/x;->h(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

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

.class public final synthetic Ll72/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lj72/j;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lj72/j;I)V
    .locals 0

    iput p3, p0, Ll72/l;->w:I

    iput-object p1, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Ll72/l;->y:Lj72/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll72/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->a(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->w(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->y(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->d(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->i(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->t(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->I(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->c(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, p0, Ll72/l;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Ll72/l;->y:Lj72/j;

    invoke-static {v0, v1}, Ll72/o;->F(Lkotlin/jvm/functions/Function1;Lj72/j;)Ll83/a0;

    move-result-object v0

    return-object v0

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

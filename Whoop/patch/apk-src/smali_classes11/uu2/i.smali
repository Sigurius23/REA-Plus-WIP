.class public final synthetic Luu2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Luu2/j0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Luu2/j0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Luu2/i;->w:I

    iput-object p1, p0, Luu2/i;->x:Luu2/j0;

    iput-object p2, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Luu2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luu2/i;->x:Luu2/j0;

    iget-object v1, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luu2/w;->f(Luu2/j0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Luu2/i;->x:Luu2/j0;

    iget-object v1, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luu2/w;->o(Luu2/j0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Luu2/i;->x:Luu2/j0;

    iget-object v1, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luu2/w;->j(Luu2/j0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Luu2/i;->x:Luu2/j0;

    iget-object v1, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luu2/l;->s(Luu2/j0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Luu2/i;->x:Luu2/j0;

    iget-object v1, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luu2/l;->m(Luu2/j0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Luu2/i;->x:Luu2/j0;

    iget-object v1, p0, Luu2/i;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Luu2/l;->w(Luu2/j0;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

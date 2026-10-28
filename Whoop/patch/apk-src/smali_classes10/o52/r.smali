.class public final synthetic Lo52/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo52/w;


# direct methods
.method public synthetic constructor <init>(Lo52/w;I)V
    .locals 0

    iput p2, p0, Lo52/r;->w:I

    iput-object p1, p0, Lo52/r;->x:Lo52/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo52/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/r;->x:Lo52/w;

    check-cast p1, Ltv/b;

    invoke-static {v0, p1}, Lo52/w;->X(Lo52/w;Ltv/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo52/r;->x:Lo52/w;

    check-cast p1, Lp92/h;

    invoke-static {v0, p1}, Lo52/w;->S(Lo52/w;Lp92/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lo52/r;->x:Lo52/w;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, Lo52/w;->I(Lo52/w;Ljava/lang/Long;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lo52/r;->x:Lo52/w;

    check-cast p1, Ljava/lang/Float;

    invoke-static {v0, p1}, Lo52/w;->L(Lo52/w;Ljava/lang/Float;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lo52/r;->x:Lo52/w;

    check-cast p1, Ljava/lang/Float;

    invoke-static {v0, p1}, Lo52/w;->V(Lo52/w;Ljava/lang/Float;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lo52/r;->x:Lo52/w;

    check-cast p1, Lp92/h$a;

    invoke-static {v0, p1}, Lo52/w;->Q(Lo52/w;Lp92/h$a;)Ll83/a0;

    move-result-object p1

    return-object p1

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

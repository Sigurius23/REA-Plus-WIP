.class public final synthetic Lo52/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo52/d0;


# direct methods
.method public synthetic constructor <init>(Lo52/d0;I)V
    .locals 0

    iput p2, p0, Lo52/b0;->w:I

    iput-object p1, p0, Lo52/b0;->x:Lo52/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lo52/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/b0;->x:Lo52/d0;

    check-cast p1, Lo52/f;

    invoke-static {v0, p1}, Lo52/d0;->N(Lo52/d0;Lo52/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lo52/b0;->x:Lo52/d0;

    check-cast p1, Lp92/h;

    invoke-static {v0, p1}, Lo52/d0;->G(Lo52/d0;Lp92/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lo52/b0;->x:Lo52/d0;

    check-cast p1, Lm52/c;

    invoke-static {v0, p1}, Lo52/d0;->J(Lo52/d0;Lm52/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lo52/b0;->x:Lo52/d0;

    check-cast p1, Ljava/lang/Long;

    invoke-static {v0, p1}, Lo52/d0;->H(Lo52/d0;Ljava/lang/Long;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lo52/b0;->x:Lo52/d0;

    invoke-static {v0, p1}, Lo52/d0;->E(Lo52/d0;F)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

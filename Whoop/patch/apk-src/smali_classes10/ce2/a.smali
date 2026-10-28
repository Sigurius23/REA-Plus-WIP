.class public final synthetic Lce2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ll83/h;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ll83/h;I)V
    .locals 0

    iput p3, p0, Lce2/a;->w:I

    iput-object p1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lce2/a;->y:Ll83/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lce2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lvt1/a;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lwt1/a;->b(Lkotlin/jvm/functions/Function1;Ll83/h;Lvt1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lce2/a;->y:Ll83/h;

    invoke-static {v0, v1, p1}, Ls32/f;->g(Lkotlin/jvm/functions/Function1;Ll83/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lpd2/b;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lqd2/a;->j(Lkotlin/jvm/functions/Function1;Ll83/h;Lpd2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lnt1/a;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lot1/c;->r(Lkotlin/jvm/functions/Function1;Ll83/h;Lnt1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lme2/a;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lne2/a;->h(Lkotlin/jvm/functions/Function1;Ll83/h;Lme2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lge2/d;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lhe2/h;->d(Lkotlin/jvm/functions/Function1;Ll83/h;Lge2/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lce2/a;->y:Ll83/h;

    invoke-static {v0, v1, p1}, Lgf1/i;->g(Lkotlin/jvm/functions/Function1;Ll83/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lbt1/b;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lct1/a;->e(Lkotlin/jvm/functions/Function1;Ll83/h;Lbt1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lce2/a;->y:Ll83/h;

    check-cast p1, Lbe2/b;

    iget-object v1, p0, Lce2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lce2/c;->b(Lkotlin/jvm/functions/Function1;Ll83/h;Lbe2/b;)Ll83/a0;

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

.class public final synthetic Lih0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lih0/f0;->w:I

    iput-object p2, p0, Lih0/f0;->x:Ljava/lang/Object;

    iput-object p3, p0, Lih0/f0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lih0/f0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lih0/f0;->x:Ljava/lang/Object;

    check-cast v0, Lah0/h;

    iget-object v1, p0, Lih0/f0;->y:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, p1}, Lih0/e0;->t(Lah0/h;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lih0/f0;->x:Ljava/lang/Object;

    check-cast v0, Lc93/m;

    iget-object v1, p0, Lih0/f0;->y:Ljava/lang/Object;

    check-cast v1, Lah0/f;

    check-cast p1, Lq3/y;

    invoke-static {v0, v1, p1}, Lih0/e0;->i(Lc93/m;Lah0/f;Lq3/y;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lih0/f0;->x:Ljava/lang/Object;

    check-cast v0, Lql0/c;

    iget-object v1, p0, Lih0/f0;->y:Ljava/lang/Object;

    check-cast v1, Lp1/c1;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lih0/l;->i(Lql0/c;Lp1/c1;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lih0/f0;->x:Ljava/lang/Object;

    check-cast v0, Lp1/t2;

    iget-object v1, p0, Lih0/f0;->y:Ljava/lang/Object;

    check-cast v1, Lah0/c;

    check-cast p1, Lh2/b;

    invoke-static {v0, v1, p1}, Lih0/e0$c;->a(Lp1/t2;Lah0/c;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

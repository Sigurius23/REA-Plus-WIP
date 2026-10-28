.class public final synthetic Lim1/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;I)V
    .locals 0

    iput p2, p0, Lim1/t;->w:I

    iput-object p1, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lim1/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->k0(Lcom/whoop/home/view/HomeFragment;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->N(Lcom/whoop/home/view/HomeFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->o0(Lcom/whoop/home/view/HomeFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->U(Lcom/whoop/home/view/HomeFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lem1/t;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->c0(Lcom/whoop/home/view/HomeFragment;Lem1/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lul1/c;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->F(Lcom/whoop/home/view/HomeFragment;Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lul1/c;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->n0(Lcom/whoop/home/view/HomeFragment;Lul1/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lim1/t;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lem1/o;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->L(Lcom/whoop/home/view/HomeFragment;Lem1/o;)Ll83/a0;

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

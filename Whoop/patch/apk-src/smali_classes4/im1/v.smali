.class public final synthetic Lim1/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic y:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lim1/v;->w:I

    iput-object p1, p0, Lim1/v;->x:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lim1/v;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lim1/v;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lim1/v;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/v;->y:Lp1/t2;

    invoke-static {v0, v1, p1}, Lcom/whoop/home/view/HomeFragment;->P(Lcom/whoop/home/view/HomeFragment;Lp1/t2;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lim1/v;->y:Lp1/t2;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lim1/v;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/home/view/HomeFragment;->G(Lcom/whoop/home/view/HomeFragment;Lp1/t2;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

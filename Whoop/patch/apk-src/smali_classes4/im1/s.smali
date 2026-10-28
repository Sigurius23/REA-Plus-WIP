.class public final synthetic Lim1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic y:Lfm1/g;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lp1/c1;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lim1/s;->w:I

    iput-object p1, p0, Lim1/s;->x:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lim1/s;->y:Lfm1/g;

    iput-object p3, p0, Lim1/s;->z:Lp1/c1;

    iput-object p4, p0, Lim1/s;->E:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lim1/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/s;->E:Lp1/t2;

    check-cast p1, Lkd1/l;

    iget-object v1, p0, Lim1/s;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v2, p0, Lim1/s;->y:Lfm1/g;

    iget-object v3, p0, Lim1/s;->z:Lp1/c1;

    invoke-static {v1, v2, v3, v0, p1}, Lcom/whoop/home/view/HomeFragment;->Y(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lp1/c1;Lp1/t2;Lkd1/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lim1/s;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/s;->y:Lfm1/g;

    iget-object v2, p0, Lim1/s;->z:Lp1/c1;

    iget-object v3, p0, Lim1/s;->E:Lp1/t2;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/whoop/home/view/HomeFragment;->b0(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lp1/c1;Lp1/t2;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

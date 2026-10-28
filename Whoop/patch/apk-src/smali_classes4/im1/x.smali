.class public final synthetic Lim1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic y:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lim1/x;->w:I

    iput-object p1, p0, Lim1/x;->x:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lim1/x;->y:Lp1/t2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lim1/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/x;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/x;->y:Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/home/view/HomeFragment;->f0(Lcom/whoop/home/view/HomeFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lim1/x;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/x;->y:Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/home/view/HomeFragment;->j0(Lcom/whoop/home/view/HomeFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lim1/x;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/x;->y:Lp1/t2;

    invoke-static {v0, v1}, Lcom/whoop/home/view/HomeFragment;->X(Lcom/whoop/home/view/HomeFragment;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

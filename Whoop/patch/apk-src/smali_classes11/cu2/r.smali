.class public final synthetic Lcu2/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcu2/r;->w:I

    iput-object p1, p0, Lcu2/r;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 3

    iget v0, p0, Lcu2/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcu2/r;->x:Ljava/lang/Object;

    check-cast v0, Luy1/e;

    invoke-static {v0, p1, p2}, Lvy1/b;->c(Luy1/e;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcu2/r;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/healthconnect/view/HealthConnectFragment;

    invoke-static {v0, p1, p2}, Lcom/whoop/healthconnect/view/HealthConnectFragment;->y(Lcom/whoop/healthconnect/view/HealthConnectFragment;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcu2/r;->x:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static {v0, p1, p2}, Lry2/f;->b(Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcu2/r;->x:Ljava/lang/Object;

    check-cast v0, Lqv/e;

    const-string v1, "<anonymous parameter 0>"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v0, Lqv/e;->x:Landroidx/lifecycle/i0;

    iget-object v1, p1, Landroidx/lifecycle/i0;->d:Landroidx/lifecycle/w;

    sget-object v2, Landroidx/lifecycle/w;->y:Landroidx/lifecycle/w;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-boolean v0, v0, Lqv/e;->y:Z

    if-nez v0, :cond_1

    if-eqz v1, :cond_2

    sget-object v0, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v0, :cond_2

    :cond_1
    invoke-virtual {p1, p2}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    :cond_2
    return-void

    :pswitch_3
    iget-object v0, p0, Lcu2/r;->x:Ljava/lang/Object;

    check-cast v0, Ll83/h;

    invoke-static {v0, p1, p2}, Lcom/whoop/weightlifting/a;->b(Ll83/h;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

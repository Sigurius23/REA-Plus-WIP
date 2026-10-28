.class public final synthetic Lln1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lln1/f;->w:I

    iput-object p1, p0, Lln1/f;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lln1/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lln1/f;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Lln1/d;

    invoke-static {v0, p1}, Lln1/q;->d(Lkotlin/jvm/functions/Function1;Lln1/d;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lln1/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;

    check-cast p1, Lhn1/a;

    invoke-static {v0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->C(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lln1/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;

    check-cast p1, Lhn1/b;

    invoke-static {v0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->y(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lhn1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lln1/f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;

    check-cast p1, Lin1/b;

    invoke-static {v0, p1}, Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;->z(Lcom/whoop/homecustomization/view/CustomizeOverviewFragment;Lin1/b;)Ll83/a0;

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

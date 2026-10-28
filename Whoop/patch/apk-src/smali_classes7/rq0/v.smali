.class public final synthetic Lrq0/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/teams/e;

.field public final synthetic y:Leq0/t1;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/teams/e;Leq0/t1;I)V
    .locals 0

    iput p3, p0, Lrq0/v;->w:I

    iput-object p1, p0, Lrq0/v;->x:Lcom/whoop/community/presentation/teams/e;

    iput-object p2, p0, Lrq0/v;->y:Leq0/t1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lrq0/v;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/v;->y:Leq0/t1;

    check-cast p1, Ljava/lang/Boolean;

    iget-object v1, p0, Lrq0/v;->x:Lcom/whoop/community/presentation/teams/e;

    invoke-static {v1, v0, p1}, Lcom/whoop/community/presentation/teams/e;->V(Lcom/whoop/community/presentation/teams/e;Leq0/t1;Ljava/lang/Boolean;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lrq0/v;->y:Leq0/t1;

    check-cast p1, Ljava/lang/Boolean;

    iget-object v1, p0, Lrq0/v;->x:Lcom/whoop/community/presentation/teams/e;

    invoke-static {v1, v0, p1}, Lcom/whoop/community/presentation/teams/e;->U(Lcom/whoop/community/presentation/teams/e;Leq0/t1;Ljava/lang/Boolean;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lrq0/v;->y:Leq0/t1;

    check-cast p1, Ljava/lang/Boolean;

    iget-object v1, p0, Lrq0/v;->x:Lcom/whoop/community/presentation/teams/e;

    invoke-static {v1, v0, p1}, Lcom/whoop/community/presentation/teams/e;->T(Lcom/whoop/community/presentation/teams/e;Leq0/t1;Ljava/lang/Boolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

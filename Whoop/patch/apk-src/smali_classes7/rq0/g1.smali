.class public final synthetic Lrq0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrq0/h1;

.field public final synthetic y:Lcom/whoop/ui/ScoreContext;


# direct methods
.method public synthetic constructor <init>(Lrq0/h1;Lcom/whoop/ui/ScoreContext;I)V
    .locals 0

    iput p3, p0, Lrq0/g1;->w:I

    iput-object p1, p0, Lrq0/g1;->x:Lrq0/h1;

    iput-object p2, p0, Lrq0/g1;->y:Lcom/whoop/ui/ScoreContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lrq0/g1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/g1;->y:Lcom/whoop/ui/ScoreContext;

    check-cast p1, Lhq0/a;

    iget-object v1, p0, Lrq0/g1;->x:Lrq0/h1;

    invoke-static {v1, v0, p1}, Lrq0/h1;->z(Lrq0/h1;Lcom/whoop/ui/ScoreContext;Lhq0/a;)Lhq0/a;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrq0/g1;->y:Lcom/whoop/ui/ScoreContext;

    check-cast p1, Lcom/whoop/domain/model/teams/LeadersEntry;

    iget-object v1, p0, Lrq0/g1;->x:Lrq0/h1;

    invoke-static {v1, v0, p1}, Lrq0/h1;->y(Lrq0/h1;Lcom/whoop/ui/ScoreContext;Lcom/whoop/domain/model/teams/LeadersEntry;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

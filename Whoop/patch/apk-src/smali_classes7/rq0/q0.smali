.class public final synthetic Lrq0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lrq0/t0;


# direct methods
.method public synthetic constructor <init>(Lrq0/t0;I)V
    .locals 0

    iput p2, p0, Lrq0/q0;->w:I

    iput-object p1, p0, Lrq0/q0;->x:Lrq0/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrq0/q0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lrq0/q0;->x:Lrq0/t0;

    check-cast p1, Lcom/whoop/domain/model/teams/TeamUserListing;

    invoke-static {v0, p1}, Lrq0/t0;->K(Lrq0/t0;Lcom/whoop/domain/model/teams/TeamUserListing;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lrq0/q0;->x:Lrq0/t0;

    check-cast p1, Lrq0/i1;

    invoke-static {v0, p1}, Lrq0/t0;->H(Lrq0/t0;Lrq0/i1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lrq0/q0;->x:Lrq0/t0;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lrq0/t0;->T(Lrq0/t0;Lib/n;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

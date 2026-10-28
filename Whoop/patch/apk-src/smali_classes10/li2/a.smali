.class public final synthetic Lli2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/strava/view/StravaFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/strava/view/StravaFragment;I)V
    .locals 0

    iput p2, p0, Lli2/a;->w:I

    iput-object p1, p0, Lli2/a;->x:Lcom/whoop/strava/view/StravaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lli2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lli2/a;->x:Lcom/whoop/strava/view/StravaFragment;

    invoke-static {v0}, Lcom/whoop/strava/view/StravaFragment;->z(Lcom/whoop/strava/view/StravaFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lli2/a;->x:Lcom/whoop/strava/view/StravaFragment;

    invoke-static {v0}, Lcom/whoop/strava/view/StravaFragment;->C(Lcom/whoop/strava/view/StravaFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lli2/a;->x:Lcom/whoop/strava/view/StravaFragment;

    invoke-static {v0}, Lcom/whoop/strava/view/StravaFragment;->y(Lcom/whoop/strava/view/StravaFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lli2/a;->x:Lcom/whoop/strava/view/StravaFragment;

    invoke-static {v0}, Lcom/whoop/strava/view/StravaFragment;->D(Lcom/whoop/strava/view/StravaFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

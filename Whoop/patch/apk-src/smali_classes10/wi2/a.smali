.class public final synthetic Lwi2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/streaks/view/StreaksFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/streaks/view/StreaksFragment;I)V
    .locals 0

    iput p2, p0, Lwi2/a;->w:I

    iput-object p1, p0, Lwi2/a;->x:Lcom/whoop/streaks/view/StreaksFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwi2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwi2/a;->x:Lcom/whoop/streaks/view/StreaksFragment;

    check-cast p1, Lgv1/m;

    invoke-static {v0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->y(Lcom/whoop/streaks/view/StreaksFragment;Lgv1/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lwi2/a;->x:Lcom/whoop/streaks/view/StreaksFragment;

    check-cast p1, Loi2/a;

    invoke-static {v0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->D(Lcom/whoop/streaks/view/StreaksFragment;Loi2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lwi2/a;->x:Lcom/whoop/streaks/view/StreaksFragment;

    check-cast p1, Lti2/e;

    invoke-static {v0, p1}, Lcom/whoop/streaks/view/StreaksFragment;->B(Lcom/whoop/streaks/view/StreaksFragment;Lti2/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

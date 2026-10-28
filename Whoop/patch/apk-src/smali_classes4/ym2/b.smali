.class public final synthetic Lym2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;I)V
    .locals 0

    iput p2, p0, Lym2/b;->w:I

    iput-object p1, p0, Lym2/b;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lym2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lym2/b;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->t(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lym2/b;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->y(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lym2/b;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->r(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lym2/b;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->x(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lym2/b;->x:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->u(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

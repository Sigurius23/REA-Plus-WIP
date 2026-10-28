.class public final synthetic Lpx0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;I)V
    .locals 0

    iput p2, p0, Lpx0/a;->w:I

    iput-object p1, p0, Lpx0/a;->x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpx0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpx0/a;->x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;

    invoke-static {v0}, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;->A(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpx0/a;->x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;

    invoke-static {v0}, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;->C(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpx0/a;->x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;

    invoke-static {v0}, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;->z(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpx0/a;->x:Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;

    invoke-static {v0}, Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;->B(Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment;)Lcom/whoop/debug/dismissalplayground/DismissalPlaygroundFragment$b;

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

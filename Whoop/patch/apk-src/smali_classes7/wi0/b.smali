.class public final synthetic Lwi0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;I)V
    .locals 0

    iput p2, p0, Lwi0/b;->w:I

    iput-object p1, p0, Lwi0/b;->x:Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lwi0/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwi0/b;->x:Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->z(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwi0/b;->x:Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;

    invoke-static {v0}, Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;->y(Lcom/whoop/archv2/feature/view/playground/PlaygroundFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

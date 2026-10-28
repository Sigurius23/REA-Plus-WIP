.class public final synthetic Lcom/whoop/profile/view/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Integer;

.field public final synthetic y:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;I)V
    .locals 0

    iput p3, p0, Lcom/whoop/profile/view/g;->w:I

    iput-object p1, p0, Lcom/whoop/profile/view/g;->x:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/profile/view/g;->y:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/whoop/profile/view/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/profile/view/g;->x:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/profile/view/g;->y:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lcom/whoop/profile/di/ProfileModule;->p(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/profile/view/g;->x:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/profile/view/g;->y:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lcom/whoop/profile/view/ProfileScreenKt;->u(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

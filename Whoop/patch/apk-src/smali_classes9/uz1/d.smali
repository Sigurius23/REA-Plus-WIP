.class public final synthetic Luz1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/nativestore/home/view/NativeStoreFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/nativestore/home/view/NativeStoreFragment;I)V
    .locals 0

    iput p2, p0, Luz1/d;->w:I

    iput-object p1, p0, Luz1/d;->x:Lcom/whoop/nativestore/home/view/NativeStoreFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Luz1/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luz1/d;->x:Lcom/whoop/nativestore/home/view/NativeStoreFragment;

    invoke-static {v0}, Lcom/whoop/nativestore/home/view/NativeStoreFragment;->z(Lcom/whoop/nativestore/home/view/NativeStoreFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Luz1/d;->x:Lcom/whoop/nativestore/home/view/NativeStoreFragment;

    invoke-static {v0}, Lcom/whoop/nativestore/home/view/NativeStoreFragment;->y(Lcom/whoop/nativestore/home/view/NativeStoreFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

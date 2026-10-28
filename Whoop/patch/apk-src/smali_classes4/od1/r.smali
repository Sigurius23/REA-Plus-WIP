.class public final synthetic Lod1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lod1/s;


# direct methods
.method public synthetic constructor <init>(Lod1/s;I)V
    .locals 0

    iput p2, p0, Lod1/r;->w:I

    iput-object p1, p0, Lod1/r;->x:Lod1/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lod1/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lod1/r;->x:Lod1/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lod1/s;->a(Lod1/s;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lod1/r;->x:Lod1/s;

    check-cast p1, Lcom/whoop/domain/model/Login;

    invoke-static {v0, p1}, Lod1/s;->d(Lod1/s;Lcom/whoop/domain/model/Login;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lod1/r;->x:Lod1/s;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lod1/s;->e(Lod1/s;Ljava/lang/Throwable;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lod1/r;->x:Lod1/s;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lod1/s;->c(Lod1/s;Ljava/util/List;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

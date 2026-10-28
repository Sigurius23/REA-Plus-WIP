.class public final synthetic Lsn/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ll9/y;

.field public final synthetic w:I

.field public final synthetic x:Lsn/z;

.field public final synthetic y:Lsn/a0;

.field public final synthetic z:Lsn/m;


# direct methods
.method public synthetic constructor <init>(Lsn/z;Lsn/a0;Lsn/m;Ll9/y;I)V
    .locals 0

    iput p5, p0, Lsn/x;->w:I

    iput-object p1, p0, Lsn/x;->x:Lsn/z;

    iput-object p2, p0, Lsn/x;->y:Lsn/a0;

    iput-object p3, p0, Lsn/x;->z:Lsn/m;

    iput-object p4, p0, Lsn/x;->E:Ll9/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lsn/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsn/x;->x:Lsn/z;

    iget v1, v0, Lsn/z;->a:I

    iget-object v0, v0, Lsn/z;->b:Lsn/v;

    iget-object v2, p0, Lsn/x;->y:Lsn/a0;

    iget-object v3, p0, Lsn/x;->z:Lsn/m;

    iget-object v4, p0, Lsn/x;->E:Ll9/y;

    invoke-interface {v2, v1, v0, v3, v4}, Lsn/a0;->a0(ILsn/v;Lsn/m;Ll9/y;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lsn/x;->x:Lsn/z;

    iget v1, v0, Lsn/z;->a:I

    iget-object v0, v0, Lsn/z;->b:Lsn/v;

    iget-object v2, p0, Lsn/x;->y:Lsn/a0;

    iget-object v3, p0, Lsn/x;->z:Lsn/m;

    iget-object v4, p0, Lsn/x;->E:Ll9/y;

    invoke-interface {v2, v1, v0, v3, v4}, Lsn/a0;->x(ILsn/v;Lsn/m;Ll9/y;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lsn/x;->x:Lsn/z;

    iget v1, v0, Lsn/z;->a:I

    iget-object v0, v0, Lsn/z;->b:Lsn/v;

    iget-object v2, p0, Lsn/x;->y:Lsn/a0;

    iget-object v3, p0, Lsn/x;->z:Lsn/m;

    iget-object v4, p0, Lsn/x;->E:Ll9/y;

    invoke-interface {v2, v1, v0, v3, v4}, Lsn/a0;->d(ILsn/v;Lsn/m;Ll9/y;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lp92/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp92/c;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Lp92/c;JJI)V
    .locals 0

    iput p6, p0, Lp92/b;->w:I

    iput-object p1, p0, Lp92/b;->x:Lp92/c;

    iput-wide p2, p0, Lp92/b;->y:J

    iput-wide p4, p0, Lp92/b;->z:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lp92/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, Lp92/b;->y:J

    iget-wide v2, p0, Lp92/b;->z:J

    iget-object v4, p0, Lp92/b;->x:Lp92/c;

    invoke-static {v4, v0, v1, v2, v3}, Lp92/c;->b(Lp92/c;JJ)V

    return-void

    :pswitch_0
    iget-wide v0, p0, Lp92/b;->y:J

    iget-wide v2, p0, Lp92/b;->z:J

    iget-object v4, p0, Lp92/b;->x:Lp92/c;

    invoke-static {v4, v0, v1, v2, v3}, Lp92/c;->a(Lp92/c;JJ)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

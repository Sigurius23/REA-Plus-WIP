.class public final synthetic Llh/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Llh/b;


# direct methods
.method public synthetic constructor <init>(Llh/b;I)V
    .locals 0

    iput p2, p0, Llh/a;->w:I

    iput-object p1, p0, Llh/a;->x:Llh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llh/a;->w:I

    iget-object v1, p0, Llh/a;->x:Llh/b;

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Llh/b;->f:Lud3/d0;

    const-string v1, "Content-Type"

    invoke-virtual {v0, v1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lud3/h0;->e:Lyb3/p;

    invoke-static {v0}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    sget-object v0, Lud3/h;->n:Lud3/h;

    iget-object v0, v1, Llh/b;->f:Lud3/d0;

    invoke-static {v0}, Lq83/g;->O(Lud3/d0;)Lud3/h;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lo52/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lo52/w;


# direct methods
.method public synthetic constructor <init>(Lo52/w;I)V
    .locals 0

    iput p2, p0, Lo52/s;->w:I

    iput-object p1, p0, Lo52/s;->x:Lo52/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lo52/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lo52/s;->x:Lo52/w;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lo52/w;->U(Lo52/w;Ljava/lang/Throwable;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lo52/s;->x:Lo52/w;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lo52/w;->K(Lo52/w;Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lo52/s;->x:Lo52/w;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lo52/w;->J(Lo52/w;Ljava/lang/Throwable;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

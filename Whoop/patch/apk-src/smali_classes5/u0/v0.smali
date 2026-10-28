.class public final synthetic Lu0/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lu0/d1;


# direct methods
.method public synthetic constructor <init>(Lu0/d1;I)V
    .locals 0

    iput p2, p0, Lu0/v0;->w:I

    iput-object p1, p0, Lu0/v0;->x:Lu0/d1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu0/v0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lu0/v0;->x:Lu0/d1;

    invoke-interface {v0}, Lu0/d1;->onCancel()V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu0/v0;->x:Lu0/d1;

    invoke-interface {v0}, Lu0/d1;->onStop()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

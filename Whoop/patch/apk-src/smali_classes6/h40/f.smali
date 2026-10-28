.class public final synthetic Lh40/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh40/k;


# direct methods
.method public synthetic constructor <init>(Lh40/k;I)V
    .locals 0

    iput p2, p0, Lh40/f;->w:I

    iput-object p1, p0, Lh40/f;->x:Lh40/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh40/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh40/f;->x:Lh40/k;

    iget-object v0, v0, Lh40/k;->a:Lg1/y3;

    invoke-virtual {v0}, Lg1/y3;->e()Z

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lh40/f;->x:Lh40/k;

    iget-object v0, v0, Lh40/k;->a:Lg1/y3;

    invoke-virtual {v0}, Lg1/y3;->e()Z

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic La41/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq0/y;


# direct methods
.method public synthetic constructor <init>(Lq0/y;I)V
    .locals 0

    iput p2, p0, La41/k;->w:I

    iput-object p1, p0, La41/k;->x:Lq0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, La41/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La41/k;->x:Lq0/y;

    invoke-static {v0}, La41/l$c$a;->f(Lq0/y;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, La41/k;->x:Lq0/y;

    invoke-static {v0}, La41/l$a;->f(Lq0/y;)I

    move-result v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

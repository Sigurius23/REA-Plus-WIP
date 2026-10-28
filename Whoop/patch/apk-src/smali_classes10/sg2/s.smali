.class public final synthetic Lsg2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lng2/f;


# direct methods
.method public synthetic constructor <init>(Lng2/f;I)V
    .locals 0

    iput p2, p0, Lsg2/s;->w:I

    iput-object p1, p0, Lsg2/s;->x:Lng2/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsg2/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsg2/s;->x:Lng2/f;

    invoke-static {v0}, Lsg2/v;->p(Lng2/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsg2/s;->x:Lng2/f;

    invoke-static {v0}, Lsg2/v;->n(Lng2/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

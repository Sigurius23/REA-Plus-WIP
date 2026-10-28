.class public final synthetic Luw0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Lc93/a;I)V
    .locals 0

    iput p2, p0, Luw0/d;->w:I

    iput-object p1, p0, Luw0/d;->x:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Luw0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luw0/d;->x:Lc93/a;

    invoke-static {v0}, Luw0/f;->l(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Luw0/d;->x:Lc93/a;

    invoke-static {v0}, Luw0/f;->i(Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

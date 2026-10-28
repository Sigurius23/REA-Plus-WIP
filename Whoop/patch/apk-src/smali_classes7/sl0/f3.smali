.class public final synthetic Lsl0/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Lc93/a;)V
    .locals 0

    iput p1, p0, Lsl0/f3;->w:I

    iput-object p2, p0, Lsl0/f3;->x:Lc93/a;

    iput-object p3, p0, Lsl0/f3;->y:Lc93/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lsl0/f3;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsl0/f3;->x:Lc93/a;

    iget-object v1, p0, Lsl0/f3;->y:Lc93/a;

    invoke-static {v0, v1}, Lsl0/g3;->n(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsl0/f3;->x:Lc93/a;

    iget-object v1, p0, Lsl0/f3;->y:Lc93/a;

    invoke-static {v0, v1}, Lsl0/g3;->f(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsl0/f3;->x:Lc93/a;

    iget-object v1, p0, Lsl0/f3;->y:Lc93/a;

    invoke-static {v0, v1}, Lsl0/g3;->b(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsl0/f3;->x:Lc93/a;

    iget-object v1, p0, Lsl0/f3;->y:Lc93/a;

    invoke-static {v0, v1}, Lsl0/g3;->l(Lc93/a;Lc93/a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

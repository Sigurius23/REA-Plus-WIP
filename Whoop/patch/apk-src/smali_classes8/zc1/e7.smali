.class public final synthetic Lzc1/e7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    iput p2, p0, Lzc1/e7;->w:I

    iput-object p1, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lzc1/e7;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-static {v0}, Lzc1/i8;->f(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-static {v0}, Lzc1/i8;->g(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-static {v0}, Lzc1/i8;->d(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-static {v0}, Lzc1/f8;->k(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-static {v0}, Lzc1/f8;->p(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lzc1/e7;->x:Landroid/content/Context;

    invoke-static {v0}, Lzc1/f7;->b(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lzk2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lw41/f;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lw41/f;I)V
    .locals 0

    iput p3, p0, Lzk2/m;->w:I

    iput-object p1, p0, Lzk2/m;->x:Lbc3/c0;

    iput-object p2, p0, Lzk2/m;->y:Lw41/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzk2/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzk2/m;->x:Lbc3/c0;

    iget-object v1, p0, Lzk2/m;->y:Lw41/f;

    invoke-static {v0, v1}, Lzk2/o;->d(Lbc3/c0;Lw41/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lzk2/m;->x:Lbc3/c0;

    iget-object v1, p0, Lzk2/m;->y:Lw41/f;

    invoke-static {v0, v1}, Lzk2/o;->a(Lbc3/c0;Lw41/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lzk2/m;->x:Lbc3/c0;

    iget-object v1, p0, Lzk2/m;->y:Lw41/f;

    invoke-static {v0, v1}, Lzk2/o;->e(Lbc3/c0;Lw41/f;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

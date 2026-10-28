.class public final synthetic Lch0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzg0/i;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lzg0/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lch0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/b0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lch0/b0;->x:Lzg0/i;

    return-void
.end method

.method public synthetic constructor <init>(Lzg0/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lch0/b0;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0/b0;->x:Lzg0/i;

    iput-object p2, p0, Lch0/b0;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lch0/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lch0/b0;->x:Lzg0/i;

    iget-object v1, p0, Lch0/b0;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lch0/m0;->y(Lkotlin/jvm/functions/Function1;Lzg0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lch0/b0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lch0/b0;->x:Lzg0/i;

    invoke-static {v0, v1}, Lch0/c0;->b(Lkotlin/jvm/functions/Function1;Lzg0/i;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

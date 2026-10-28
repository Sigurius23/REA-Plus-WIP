.class public final synthetic Lcp0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzg0/k;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(Lzg0/k;Lkotlin/jvm/functions/Function3;I)V
    .locals 0

    iput p3, p0, Lcp0/n;->w:I

    iput-object p1, p0, Lcp0/n;->x:Lzg0/k;

    iput-object p2, p0, Lcp0/n;->y:Lkotlin/jvm/functions/Function3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcp0/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp0/n;->x:Lzg0/k;

    iget-object v1, p0, Lcp0/n;->y:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, v1}, Lcp0/p;->a(Lzg0/k;Lkotlin/jvm/functions/Function3;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcp0/n;->x:Lzg0/k;

    iget-object v1, p0, Lcp0/n;->y:Lkotlin/jvm/functions/Function3;

    invoke-static {v0, v1}, Lcp0/p;->r(Lzg0/k;Lkotlin/jvm/functions/Function3;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

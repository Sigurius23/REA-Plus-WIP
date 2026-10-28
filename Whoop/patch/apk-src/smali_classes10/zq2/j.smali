.class public final synthetic Lzq2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p3, p0, Lzq2/j;->w:I

    iput-object p1, p0, Lzq2/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lzq2/j;->y:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lzq2/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lzq2/j;->y:Lp1/c1;

    check-cast p1, Lh2/b;

    iget-object v1, p0, Lzq2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lzq2/k$b;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lzq2/j;->y:Lp1/c1;

    check-cast p1, Lh2/b;

    iget-object v1, p0, Lzq2/j;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lzq2/i$b;->a(Lkotlin/jvm/functions/Function1;Lp1/c1;Lh2/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

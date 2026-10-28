.class public final Lm83/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb3/i;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lc93/m;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lm83/r;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    check-cast p1, Ls83/h;

    iput-object p1, p0, Lm83/r;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm83/r;->a:I

    iput-object p1, p0, Lm83/r;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget v0, p0, Lm83/r;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lyb3/i;

    iget-object v1, p0, Lm83/r;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-direct {v0, v1}, Lyb3/i;-><init>(Ljava/lang/CharSequence;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lm83/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lm83/r;->b:Ljava/lang/Object;

    check-cast v0, Ls83/h;

    invoke-static {v0}, Lv63/c;->i(Lc93/m;)Lxb3/j;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lm83/r;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lm83/r;->b:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

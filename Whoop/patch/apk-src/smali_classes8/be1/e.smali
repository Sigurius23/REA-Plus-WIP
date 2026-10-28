.class public final synthetic Lbe1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lzd1/d;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lzd1/d;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lbe1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe1/e;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lbe1/e;->y:Lzd1/d;

    return-void
.end method

.method public synthetic constructor <init>(Lzd1/d;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lbe1/e;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe1/e;->y:Lzd1/d;

    iput-object p2, p0, Lbe1/e;->x:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbe1/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbe1/e;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lbe1/e;->y:Lzd1/d;

    invoke-static {v0, v1}, Lbe1/g;->q(Lkotlin/jvm/functions/Function1;Lzd1/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbe1/e;->y:Lzd1/d;

    iget-object v1, p0, Lbe1/e;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0}, Lbe1/g;->r(Lkotlin/jvm/functions/Function1;Lzd1/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

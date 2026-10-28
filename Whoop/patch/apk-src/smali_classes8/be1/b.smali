.class public final synthetic Lbe1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzd1/d$e;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lzd1/d$e;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Lbe1/b;->w:I

    iput-object p1, p0, Lbe1/b;->x:Lzd1/d$e;

    iput-object p2, p0, Lbe1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lbe1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lbe1/b;->x:Lzd1/d$e;

    iget-object v1, p0, Lbe1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lbe1/g;->h(Lzd1/d$e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lbe1/b;->x:Lzd1/d$e;

    iget-object v1, p0, Lbe1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lbe1/g;->w(Lzd1/d$e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lbe1/b;->x:Lzd1/d$e;

    iget-object v1, p0, Lbe1/b;->y:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lbe1/g;->a(Lzd1/d$e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

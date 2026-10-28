.class public final synthetic Lb30/d5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lh20/r0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lh20/r0;I)V
    .locals 0

    iput p3, p0, Lb30/d5;->w:I

    iput-object p1, p0, Lb30/d5;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb30/d5;->y:Lh20/r0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb30/d5;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb30/d5;->y:Lh20/r0;

    const/4 v1, 0x0

    new-instance v2, Lq20/w;

    iget-object v0, v0, Lh20/r0;->c:Ly00/o4;

    invoke-direct {v2, v0, v1, v1}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    iget-object v0, p0, Lb30/d5;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb30/d5;->y:Lh20/r0;

    iget-object v0, v0, Lh20/r0;->a:Lh20/l;

    iget-object v1, p0, Lb30/d5;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

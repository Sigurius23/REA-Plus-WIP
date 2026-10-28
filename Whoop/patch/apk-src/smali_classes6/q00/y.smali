.class public final synthetic Lq00/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Ly00/c0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ly00/c0;I)V
    .locals 0

    iput p3, p0, Lq00/y;->w:I

    iput-object p1, p0, Lq00/y;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lq00/y;->y:Ly00/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lq00/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq00/y;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq00/y;->y:Ly00/c0;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lq00/y;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq00/y;->y:Ly00/c0;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

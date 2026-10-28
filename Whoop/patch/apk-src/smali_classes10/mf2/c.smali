.class public final synthetic Lmf2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkf2/d;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkf2/d;I)V
    .locals 0

    iput p3, p0, Lmf2/c;->w:I

    iput-object p1, p0, Lmf2/c;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lmf2/c;->y:Lkf2/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lmf2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf2/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmf2/c;->y:Lkf2/d;

    invoke-static {v0, v1}, Lmf2/f;->n(Lkotlin/jvm/functions/Function1;Lkf2/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmf2/c;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lmf2/c;->y:Lkf2/d;

    invoke-static {v0, v1}, Lmf2/f;->s(Lkotlin/jvm/functions/Function1;Lkf2/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

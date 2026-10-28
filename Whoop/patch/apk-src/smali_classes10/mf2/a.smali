.class public final synthetic Lmf2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lkf2/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p4, p0, Lmf2/a;->w:I

    iput-object p1, p0, Lmf2/a;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lmf2/a;->y:Lkf2/a;

    iput-object p3, p0, Lmf2/a;->z:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lmf2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf2/a;->y:Lkf2/a;

    iget-object v1, p0, Lmf2/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lmf2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lmf2/b;->e(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lmf2/a;->y:Lkf2/a;

    iget-object v1, p0, Lmf2/a;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lmf2/a;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lmf2/b;->c(Lkotlin/jvm/functions/Function1;Lkf2/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.class public final synthetic Lpt2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lv41/f$a;

.field public final synthetic w:I

.field public final synthetic x:Lg1/y3;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;I)V
    .locals 0

    iput p6, p0, Lpt2/g;->w:I

    iput-object p1, p0, Lpt2/g;->x:Lg1/y3;

    iput-object p2, p0, Lpt2/g;->y:Lbc3/c0;

    iput-object p3, p0, Lpt2/g;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lpt2/g;->E:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lpt2/g;->F:Lv41/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lpt2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/g;->F:Lv41/f$a;

    iget-object v2, p0, Lpt2/g;->x:Lg1/y3;

    iget-object v3, p0, Lpt2/g;->y:Lbc3/c0;

    iget-object v4, p0, Lpt2/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v4, v0, v1}, Lpt2/l;->q(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpt2/g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lpt2/g;->F:Lv41/f$a;

    iget-object v2, p0, Lpt2/g;->x:Lg1/y3;

    iget-object v3, p0, Lpt2/g;->y:Lbc3/c0;

    iget-object v4, p0, Lpt2/g;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3, v4, v0, v1}, Lpt2/i;->i(Lg1/y3;Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lv41/f$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

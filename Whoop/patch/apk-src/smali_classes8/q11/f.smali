.class public final synthetic Lq11/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I

.field public final synthetic z:Lq11/i;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILq11/i;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lq11/f;->w:I

    iput-object p1, p0, Lq11/f;->x:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lq11/f;->y:I

    iput-object p3, p0, Lq11/f;->z:Lq11/i;

    iput-object p4, p0, Lq11/f;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lq11/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq11/f;->z:Lq11/i;

    iget-object v1, p0, Lq11/f;->E:Lp1/c1;

    iget-object v2, p0, Lq11/f;->x:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lq11/f;->y:I

    invoke-static {v2, v3, v0, v1}, Lq11/h;->c(Lkotlin/jvm/functions/Function1;ILq11/i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lq11/f;->z:Lq11/i;

    iget-object v1, p0, Lq11/f;->E:Lp1/c1;

    iget-object v2, p0, Lq11/f;->x:Lkotlin/jvm/functions/Function1;

    iget v3, p0, Lq11/f;->y:I

    invoke-static {v2, v3, v0, v1}, Lq11/h;->a(Lkotlin/jvm/functions/Function1;ILq11/i;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

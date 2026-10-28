.class public final synthetic Lim1/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lem1/v;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lem1/v;Lp1/c1;I)V
    .locals 0

    iput p4, p0, Lim1/r0;->w:I

    iput-object p1, p0, Lim1/r0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lim1/r0;->y:Lem1/v;

    iput-object p3, p0, Lim1/r0;->z:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lim1/r0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/r0;->y:Lem1/v;

    iget-object v1, p0, Lim1/r0;->z:Lp1/c1;

    iget-object v2, p0, Lim1/r0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lim1/t0;->j(Lkotlin/jvm/functions/Function1;Lem1/v;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lim1/r0;->y:Lem1/v;

    iget-object v1, p0, Lim1/r0;->z:Lp1/c1;

    iget-object v2, p0, Lim1/r0;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lim1/t0;->c0(Lkotlin/jvm/functions/Function1;Lem1/v;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

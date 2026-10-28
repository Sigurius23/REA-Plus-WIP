.class public final synthetic Lq00/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ly00/c0;

.field public final synthetic w:I

.field public final synthetic x:Lbc3/c0;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;I)V
    .locals 0

    iput p5, p0, Lq00/d0;->w:I

    iput-object p1, p0, Lq00/d0;->x:Lbc3/c0;

    iput-object p2, p0, Lq00/d0;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lq00/d0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lq00/d0;->E:Ly00/c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lq00/d0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lq00/e0;

    const/4 v6, 0x2

    iget-object v2, p0, Lq00/d0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lq00/d0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lq00/d0;->E:Ly00/c0;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v6}, Lq00/e0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq00/d0;->x:Lbc3/c0;

    invoke-static {v2, v5, v5, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    new-instance v1, Lq00/e0;

    const/4 v6, 0x1

    iget-object v2, p0, Lq00/d0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lq00/d0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lq00/d0;->E:Ly00/c0;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v6}, Lq00/e0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq00/d0;->x:Lbc3/c0;

    invoke-static {v2, v5, v5, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :pswitch_1
    new-instance v1, Lq00/e0;

    const/4 v6, 0x0

    iget-object v2, p0, Lq00/d0;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lq00/d0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lq00/d0;->E:Ly00/c0;

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v6}, Lq00/e0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ly00/c0;Lq83/d;I)V

    const/4 v0, 0x3

    iget-object v2, p0, Lq00/d0;->x:Lbc3/c0;

    invoke-static {v2, v5, v5, v1, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

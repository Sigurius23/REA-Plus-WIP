.class public final synthetic Lat2/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lys2/e$n;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lys2/e$n;Lkotlin/jvm/functions/Function1;Lp1/c1;I)V
    .locals 0

    iput p5, p0, Lat2/k0;->w:I

    iput-object p1, p0, Lat2/k0;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lat2/k0;->y:Lys2/e$n;

    iput-object p3, p0, Lat2/k0;->z:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lat2/k0;->E:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lat2/k0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lat2/k0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/k0;->E:Lp1/c1;

    iget-object v2, p0, Lat2/k0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lat2/k0;->y:Lys2/e$n;

    invoke-static {v2, v3, v0, v1}, Lat2/o0;->j(Lkotlin/jvm/functions/Function1;Lys2/e$n;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lat2/k0;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lat2/k0;->E:Lp1/c1;

    iget-object v2, p0, Lat2/k0;->x:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lat2/k0;->y:Lys2/e$n;

    invoke-static {v2, v3, v0, v1}, Lat2/o0;->g(Lkotlin/jvm/functions/Function1;Lys2/e$n;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

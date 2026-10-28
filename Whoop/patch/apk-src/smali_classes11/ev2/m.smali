.class public final synthetic Lev2/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lbc3/c0;

.field public final synthetic F:Lg1/y3;

.field public final synthetic G:Lp1/c1;

.field public final synthetic w:I

.field public final synthetic x:Ldv2/e$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function3;

.field public final synthetic z:Lg2/i;


# direct methods
.method public synthetic constructor <init>(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;I)V
    .locals 0

    iput p7, p0, Lev2/m;->w:I

    iput-object p1, p0, Lev2/m;->x:Ldv2/e$b;

    iput-object p2, p0, Lev2/m;->y:Lkotlin/jvm/functions/Function3;

    iput-object p3, p0, Lev2/m;->z:Lg2/i;

    iput-object p4, p0, Lev2/m;->E:Lbc3/c0;

    iput-object p5, p0, Lev2/m;->F:Lg1/y3;

    iput-object p6, p0, Lev2/m;->G:Lp1/c1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lev2/m;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lev2/m;->x:Ldv2/e$b;

    iget-object v2, p0, Lev2/m;->y:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lev2/m;->z:Lg2/i;

    iget-object v4, p0, Lev2/m;->E:Lbc3/c0;

    iget-object v5, p0, Lev2/m;->F:Lg1/y3;

    iget-object v6, p0, Lev2/m;->G:Lp1/c1;

    invoke-static/range {v1 .. v8}, Lev2/u;->r(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lev2/m;->x:Ldv2/e$b;

    iget-object v1, p0, Lev2/m;->y:Lkotlin/jvm/functions/Function3;

    iget-object v2, p0, Lev2/m;->z:Lg2/i;

    iget-object v3, p0, Lev2/m;->E:Lbc3/c0;

    iget-object v4, p0, Lev2/m;->F:Lg1/y3;

    iget-object v5, p0, Lev2/m;->G:Lp1/c1;

    invoke-static/range {v0 .. v7}, Lev2/n;->d(Ldv2/e$b;Lkotlin/jvm/functions/Function3;Lg2/i;Lbc3/c0;Lg1/y3;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

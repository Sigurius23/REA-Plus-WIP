.class public final synthetic Lam2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:I

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:Ln0/u;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;III)V
    .locals 0

    iput p7, p0, Lam2/i;->w:I

    iput-object p1, p0, Lam2/i;->x:Ln0/u;

    iput p2, p0, Lam2/i;->y:I

    iput-object p3, p0, Lam2/i;->z:Ljava/lang/String;

    iput-object p4, p0, Lam2/i;->E:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lam2/i;->F:I

    iput p6, p0, Lam2/i;->G:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lam2/i;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v1, p0, Lam2/i;->x:Ln0/u;

    iget v2, p0, Lam2/i;->y:I

    iget-object v3, p0, Lam2/i;->z:Ljava/lang/String;

    iget-object v4, p0, Lam2/i;->E:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lam2/i;->F:I

    iget v6, p0, Lam2/i;->G:I

    invoke-static/range {v1 .. v8}, Lgb1/q;->a(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lam2/i;->x:Ln0/u;

    iget v1, p0, Lam2/i;->y:I

    iget-object v2, p0, Lam2/i;->z:Ljava/lang/String;

    iget-object v3, p0, Lam2/i;->E:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lam2/i;->F:I

    iget v5, p0, Lam2/i;->G:I

    invoke-static/range {v0 .. v7}, Lam2/w;->u(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Lam2/i;->x:Ln0/u;

    iget v1, p0, Lam2/i;->y:I

    iget-object v2, p0, Lam2/i;->z:Ljava/lang/String;

    iget-object v3, p0, Lam2/i;->E:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lam2/i;->F:I

    iget v5, p0, Lam2/i;->G:I

    invoke-static/range {v0 .. v7}, Lam2/k;->t(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

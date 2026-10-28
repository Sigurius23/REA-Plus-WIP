.class public final synthetic Lsv2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lg1/y3;

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:Lrv2/h$b;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public synthetic constructor <init>(Lbc3/c0;Lg1/y3;Lrv2/h$b;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lsv2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsv2/d;->z:Lbc3/c0;

    iput-object p2, p0, Lsv2/d;->E:Lg1/y3;

    iput-object p3, p0, Lsv2/d;->x:Lrv2/h$b;

    iput-object p4, p0, Lsv2/d;->y:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lsv2/d;->F:I

    return-void
.end method

.method public synthetic constructor <init>(Lrv2/h$b;Lkotlin/jvm/functions/Function1;Lbc3/c0;Lg1/y3;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lsv2/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsv2/d;->x:Lrv2/h$b;

    iput-object p2, p0, Lsv2/d;->y:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lsv2/d;->z:Lbc3/c0;

    iput-object p4, p0, Lsv2/d;->E:Lg1/y3;

    iput p5, p0, Lsv2/d;->F:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lsv2/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v1, p0, Lsv2/d;->z:Lbc3/c0;

    iget-object v2, p0, Lsv2/d;->E:Lg1/y3;

    iget-object v3, p0, Lsv2/d;->x:Lrv2/h$b;

    iget-object v4, p0, Lsv2/d;->y:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lsv2/d;->F:I

    invoke-static/range {v1 .. v7}, Lsv2/e;->Q(Lbc3/c0;Lg1/y3;Lrv2/h$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lsv2/d;->z:Lbc3/c0;

    iget-object v1, p0, Lsv2/d;->E:Lg1/y3;

    iget-object v2, p0, Lsv2/d;->x:Lrv2/h$b;

    iget-object v3, p0, Lsv2/d;->y:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lsv2/d;->F:I

    invoke-static/range {v0 .. v6}, Lsv2/e;->q(Lbc3/c0;Lg1/y3;Lrv2/h$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

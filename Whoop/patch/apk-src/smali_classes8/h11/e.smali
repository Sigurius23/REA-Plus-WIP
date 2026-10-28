.class public final synthetic Lh11/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lgz0/m0;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILc93/a;Lgz0/m0;Ljava/lang/String;)V
    .locals 0

    iput p1, p0, Lh11/e;->w:I

    iput-object p3, p0, Lh11/e;->x:Lgz0/m0;

    iput-object p2, p0, Lh11/e;->y:Lc93/a;

    iput-object p4, p0, Lh11/e;->z:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lh11/e;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/a;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v1, p0, Lh11/e;->x:Lgz0/m0;

    iget-object v2, p0, Lh11/e;->y:Lc93/a;

    iget-object v3, p0, Lh11/e;->z:Ljava/lang/String;

    invoke-static/range {v1 .. v6}, Lh11/f;->b(Lgz0/m0;Lc93/a;Ljava/lang/String;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/lazy/a;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v0, p0, Lh11/e;->x:Lgz0/m0;

    iget-object v1, p0, Lh11/e;->y:Lc93/a;

    iget-object v2, p0, Lh11/e;->z:Ljava/lang/String;

    invoke-static/range {v0 .. v5}, Lh11/f;->a(Lgz0/m0;Lc93/a;Ljava/lang/String;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

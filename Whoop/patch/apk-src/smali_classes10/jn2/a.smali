.class public final synthetic Ljn2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(FJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Ljn2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljn2/a;->x:F

    iput-wide p2, p0, Ljn2/a;->y:J

    return-void
.end method

.method public synthetic constructor <init>(JF)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Ljn2/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ljn2/a;->y:J

    iput p3, p0, Ljn2/a;->x:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ljn2/a;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v4, p1

    check-cast v4, Lc0/i0;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget v1, p0, Ljn2/a;->x:F

    iget-wide v2, p0, Ljn2/a;->y:J

    invoke-static/range {v1 .. v6}, Ljz0/c;->a(FJLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v3, p1

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-wide v0, p0, Ljn2/a;->y:J

    iget v2, p0, Ljn2/a;->x:F

    invoke-static/range {v0 .. v5}, Ljn2/c;->b(JFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

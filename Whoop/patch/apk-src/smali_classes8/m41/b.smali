.class public final synthetic Lm41/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFJI)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lm41/b;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lm41/b;->y:F

    iput p2, p0, Lm41/b;->z:F

    iput p3, p0, Lm41/b;->E:F

    iput-wide p4, p0, Lm41/b;->x:J

    iput p6, p0, Lm41/b;->F:I

    return-void
.end method

.method public synthetic constructor <init>(JFFFII)V
    .locals 0

    .line 2
    iput p7, p0, Lm41/b;->w:I

    iput-wide p1, p0, Lm41/b;->x:J

    iput p3, p0, Lm41/b;->y:F

    iput p4, p0, Lm41/b;->z:F

    iput p5, p0, Lm41/b;->E:F

    iput p6, p0, Lm41/b;->F:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lm41/b;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v1, p0, Lm41/b;->y:F

    iget v2, p0, Lm41/b;->z:F

    iget v3, p0, Lm41/b;->E:F

    iget-wide v4, p0, Lm41/b;->x:J

    iget v6, p0, Lm41/b;->F:I

    invoke-static/range {v1 .. v8}, Lz51/i;->a(FFFJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v0, p0, Lm41/b;->y:F

    iget v1, p0, Lm41/b;->z:F

    iget v2, p0, Lm41/b;->E:F

    iget-wide v3, p0, Lm41/b;->x:J

    iget v5, p0, Lm41/b;->F:I

    invoke-static/range {v0 .. v7}, Lm41/e;->h(FFFJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget v0, p0, Lm41/b;->y:F

    iget v1, p0, Lm41/b;->z:F

    iget v2, p0, Lm41/b;->E:F

    iget-wide v3, p0, Lm41/b;->x:J

    iget v5, p0, Lm41/b;->F:I

    invoke-static/range {v0 .. v7}, Lm41/e;->k(FFFJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

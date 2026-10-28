.class public final synthetic Ldp0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:F

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(FII)V
    .locals 0

    iput p3, p0, Ldp0/b;->w:I

    iput p1, p0, Ldp0/b;->x:F

    iput p2, p0, Ldp0/b;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ldp0/b;->w:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lzc1/d6;->g(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lsz0/a1;->d(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lm12/d;->d(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Ljk2/c;->c(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lgz0/g;->d(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lgz0/g;->b(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Lgz0/g;->e(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget v0, p0, Ldp0/b;->x:F

    iget v1, p0, Ldp0/b;->y:I

    invoke-static {v0, v1, p1, p2}, Ldp0/c;->c(FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

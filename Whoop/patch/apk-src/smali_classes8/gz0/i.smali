.class public final synthetic Lgz0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Lc93/a;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Lo2/e;

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lo2/e;FZLjava/lang/String;Lc93/a;III)V
    .locals 0

    iput p8, p0, Lgz0/i;->w:I

    iput-object p1, p0, Lgz0/i;->x:Lo2/e;

    iput p2, p0, Lgz0/i;->y:F

    iput-boolean p3, p0, Lgz0/i;->z:Z

    iput-object p4, p0, Lgz0/i;->E:Ljava/lang/String;

    iput-object p5, p0, Lgz0/i;->F:Lc93/a;

    iput p6, p0, Lgz0/i;->G:I

    iput p7, p0, Lgz0/i;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lgz0/i;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lgz0/i;->x:Lo2/e;

    iget v2, p0, Lgz0/i;->y:F

    iget-boolean v3, p0, Lgz0/i;->z:Z

    iget-object v4, p0, Lgz0/i;->E:Ljava/lang/String;

    iget-object v5, p0, Lgz0/i;->F:Lc93/a;

    iget v6, p0, Lgz0/i;->G:I

    iget v7, p0, Lgz0/i;->H:I

    invoke-static/range {v1 .. v9}, Lgz0/j;->d(Lo2/e;FZLjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lgz0/i;->x:Lo2/e;

    iget v1, p0, Lgz0/i;->y:F

    iget-boolean v2, p0, Lgz0/i;->z:Z

    iget-object v3, p0, Lgz0/i;->E:Ljava/lang/String;

    iget-object v4, p0, Lgz0/i;->F:Lc93/a;

    iget v5, p0, Lgz0/i;->G:I

    iget v6, p0, Lgz0/i;->H:I

    invoke-static/range {v0 .. v8}, Lgz0/j;->b(Lo2/e;FZLjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lgz0/i;->x:Lo2/e;

    iget v1, p0, Lgz0/i;->y:F

    iget-boolean v2, p0, Lgz0/i;->z:Z

    iget-object v3, p0, Lgz0/i;->E:Ljava/lang/String;

    iget-object v4, p0, Lgz0/i;->F:Lc93/a;

    iget v5, p0, Lgz0/i;->G:I

    iget v6, p0, Lgz0/i;->H:I

    invoke-static/range {v0 .. v8}, Lgz0/j;->o(Lo2/e;FZLjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

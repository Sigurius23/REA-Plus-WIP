.class public final synthetic Lw41/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lw41/f;

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Lw41/z;

.field public final synthetic y:Landroidx/compose/ui/Modifier;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIII)V
    .locals 0

    iput p8, p0, Lw41/h;->w:I

    iput-object p1, p0, Lw41/h;->x:Lw41/z;

    iput-object p2, p0, Lw41/h;->y:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Lw41/h;->z:Z

    iput-object p4, p0, Lw41/h;->E:Lw41/f;

    iput-boolean p5, p0, Lw41/h;->F:Z

    iput p6, p0, Lw41/h;->G:I

    iput p7, p0, Lw41/h;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lw41/h;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lw41/h;->x:Lw41/z;

    iget-object v2, p0, Lw41/h;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Lw41/h;->z:Z

    iget-object v4, p0, Lw41/h;->E:Lw41/f;

    iget-boolean v5, p0, Lw41/h;->F:Z

    iget v6, p0, Lw41/h;->G:I

    iget v7, p0, Lw41/h;->H:I

    invoke-static/range {v1 .. v9}, Lw41/k;->c(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lw41/h;->x:Lw41/z;

    iget-object v1, p0, Lw41/h;->y:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lw41/h;->z:Z

    iget-object v3, p0, Lw41/h;->E:Lw41/f;

    iget-boolean v4, p0, Lw41/h;->F:Z

    iget v5, p0, Lw41/h;->G:I

    iget v6, p0, Lw41/h;->H:I

    invoke-static/range {v0 .. v8}, Lw41/k;->e(Lw41/z;Landroidx/compose/ui/Modifier;ZLw41/f;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

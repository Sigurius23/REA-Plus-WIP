.class public final synthetic Lvn1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Landroidx/compose/ui/Modifier;

.field public final synthetic F:Lc93/m;

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lc93/m;III)V
    .locals 0

    iput p8, p0, Lvn1/r;->w:I

    iput-object p1, p0, Lvn1/r;->x:Ljava/lang/String;

    iput-boolean p2, p0, Lvn1/r;->y:Z

    iput-object p3, p0, Lvn1/r;->z:Lc93/a;

    iput-object p4, p0, Lvn1/r;->E:Landroidx/compose/ui/Modifier;

    iput-object p5, p0, Lvn1/r;->F:Lc93/m;

    iput p6, p0, Lvn1/r;->G:I

    iput p7, p0, Lvn1/r;->H:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lvn1/r;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Lvn1/r;->x:Ljava/lang/String;

    iget-boolean v2, p0, Lvn1/r;->y:Z

    iget-object v3, p0, Lvn1/r;->z:Lc93/a;

    iget-object v4, p0, Lvn1/r;->E:Landroidx/compose/ui/Modifier;

    iget-object v5, p0, Lvn1/r;->F:Lc93/m;

    iget v6, p0, Lvn1/r;->G:I

    iget v7, p0, Lvn1/r;->H:I

    invoke-static/range {v1 .. v9}, Lvn1/s;->e(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lvn1/r;->x:Ljava/lang/String;

    iget-boolean v1, p0, Lvn1/r;->y:Z

    iget-object v2, p0, Lvn1/r;->z:Lc93/a;

    iget-object v3, p0, Lvn1/r;->E:Landroidx/compose/ui/Modifier;

    iget-object v4, p0, Lvn1/r;->F:Lc93/m;

    iget v5, p0, Lvn1/r;->G:I

    iget v6, p0, Lvn1/r;->H:I

    invoke-static/range {v0 .. v8}, Lvn1/s;->f(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

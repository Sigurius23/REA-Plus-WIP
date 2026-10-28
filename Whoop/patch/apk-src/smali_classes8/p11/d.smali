.class public final synthetic Lp11/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public final synthetic G:Lc93/m;

.field public final synthetic H:Lc93/m;

.field public final synthetic I:I

.field public final synthetic J:I

.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/Modifier;

.field public final synthetic y:Z

.field public final synthetic z:Lc93/a;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;ZLc93/a;Ljava/lang/String;Ljava/lang/String;Lc93/m;Lc93/m;III)V
    .locals 0

    iput p10, p0, Lp11/d;->w:I

    iput-object p1, p0, Lp11/d;->x:Landroidx/compose/ui/Modifier;

    iput-boolean p2, p0, Lp11/d;->y:Z

    iput-object p3, p0, Lp11/d;->z:Lc93/a;

    iput-object p4, p0, Lp11/d;->E:Ljava/lang/String;

    iput-object p5, p0, Lp11/d;->F:Ljava/lang/String;

    iput-object p6, p0, Lp11/d;->G:Lc93/m;

    iput-object p7, p0, Lp11/d;->H:Lc93/m;

    iput p8, p0, Lp11/d;->I:I

    iput p9, p0, Lp11/d;->J:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lp11/d;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lp11/d;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lp11/d;->y:Z

    iget-object v3, p0, Lp11/d;->z:Lc93/a;

    iget-object v4, p0, Lp11/d;->E:Ljava/lang/String;

    iget-object v5, p0, Lp11/d;->F:Ljava/lang/String;

    iget-object v6, p0, Lp11/d;->G:Lc93/m;

    iget-object v7, p0, Lp11/d;->H:Lc93/m;

    iget v8, p0, Lp11/d;->I:I

    iget v9, p0, Lp11/d;->J:I

    invoke-static/range {v1 .. v11}, Lp11/e;->b(Landroidx/compose/ui/Modifier;ZLc93/a;Ljava/lang/String;Ljava/lang/String;Lc93/m;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v9, p1

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lp11/d;->x:Landroidx/compose/ui/Modifier;

    iget-boolean v1, p0, Lp11/d;->y:Z

    iget-object v2, p0, Lp11/d;->z:Lc93/a;

    iget-object v3, p0, Lp11/d;->E:Ljava/lang/String;

    iget-object v4, p0, Lp11/d;->F:Ljava/lang/String;

    iget-object v5, p0, Lp11/d;->G:Lc93/m;

    iget-object v6, p0, Lp11/d;->H:Lc93/m;

    iget v7, p0, Lp11/d;->I:I

    iget v8, p0, Lp11/d;->J:I

    invoke-static/range {v0 .. v10}, Lp11/e;->h(Landroidx/compose/ui/Modifier;ZLc93/a;Ljava/lang/String;Ljava/lang/String;Lc93/m;Lc93/m;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

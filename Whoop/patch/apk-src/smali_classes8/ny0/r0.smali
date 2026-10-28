.class public final synthetic Lny0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lny0/v0;

.field public final synthetic F:Z

.field public final synthetic G:Z

.field public final synthetic H:F

.field public final synthetic I:Ljava/lang/String;

.field public final synthetic J:Lc93/a;

.field public final synthetic K:I

.field public final synthetic L:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lny0/r0;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lny0/r0;->x:Ljava/lang/String;

    iput-object p3, p0, Lny0/r0;->y:Ljava/lang/String;

    iput-object p4, p0, Lny0/r0;->z:Ljava/lang/String;

    iput-object p5, p0, Lny0/r0;->E:Lny0/v0;

    iput-boolean p6, p0, Lny0/r0;->F:Z

    iput-boolean p7, p0, Lny0/r0;->G:Z

    iput p8, p0, Lny0/r0;->H:F

    iput-object p9, p0, Lny0/r0;->I:Ljava/lang/String;

    iput-object p10, p0, Lny0/r0;->J:Lc93/a;

    iput p11, p0, Lny0/r0;->K:I

    iput p12, p0, Lny0/r0;->L:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v12, p1

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lny0/r0;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lny0/r0;->x:Ljava/lang/String;

    iget-object v2, p0, Lny0/r0;->y:Ljava/lang/String;

    iget-object v3, p0, Lny0/r0;->z:Ljava/lang/String;

    iget-object v4, p0, Lny0/r0;->E:Lny0/v0;

    iget-boolean v5, p0, Lny0/r0;->F:Z

    iget-boolean v6, p0, Lny0/r0;->G:Z

    iget v7, p0, Lny0/r0;->H:F

    iget-object v8, p0, Lny0/r0;->I:Ljava/lang/String;

    iget-object v9, p0, Lny0/r0;->J:Lc93/a;

    iget v10, p0, Lny0/r0;->K:I

    iget v11, p0, Lny0/r0;->L:I

    invoke-static/range {v0 .. v13}, Lny0/u0;->e(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lny0/v0;ZZFLjava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

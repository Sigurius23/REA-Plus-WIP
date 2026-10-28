.class public final synthetic Lch0/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/navigation/ChatEntrypointExperience;

.field public final synthetic F:Lbc3/c0;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lg1/y3;

.field public final synthetic I:Lg1/y3;

.field public final synthetic J:Z

.field public final synthetic K:Z

.field public final synthetic L:Landroidx/compose/ui/Modifier;

.field public final synthetic M:Lp1/c1;

.field public final synthetic N:Landroidx/compose/ui/Modifier;

.field public final synthetic w:Z

.field public final synthetic x:Lzg0/i;

.field public final synthetic y:Lch0/v0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZLzg0/i;Lch0/v0;ZLcom/whoop/navigation/ChatEntrypointExperience;Lbc3/c0;Lc93/a;Lg1/y3;Lg1/y3;ZZLandroidx/compose/ui/Modifier;Lp1/c1;Landroidx/compose/ui/Modifier;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lch0/y0;->w:Z

    iput-object p2, p0, Lch0/y0;->x:Lzg0/i;

    iput-object p3, p0, Lch0/y0;->y:Lch0/v0;

    iput-boolean p4, p0, Lch0/y0;->z:Z

    iput-object p5, p0, Lch0/y0;->E:Lcom/whoop/navigation/ChatEntrypointExperience;

    iput-object p6, p0, Lch0/y0;->F:Lbc3/c0;

    iput-object p7, p0, Lch0/y0;->G:Lc93/a;

    iput-object p8, p0, Lch0/y0;->H:Lg1/y3;

    iput-object p9, p0, Lch0/y0;->I:Lg1/y3;

    iput-boolean p10, p0, Lch0/y0;->J:Z

    iput-boolean p11, p0, Lch0/y0;->K:Z

    iput-object p12, p0, Lch0/y0;->L:Landroidx/compose/ui/Modifier;

    iput-object p13, p0, Lch0/y0;->M:Lp1/c1;

    iput-object p14, p0, Lch0/y0;->N:Landroidx/compose/ui/Modifier;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v16

    iget-boolean v1, v0, Lch0/y0;->w:Z

    iget-object v2, v0, Lch0/y0;->x:Lzg0/i;

    iget-object v3, v0, Lch0/y0;->y:Lch0/v0;

    iget-boolean v4, v0, Lch0/y0;->z:Z

    iget-object v5, v0, Lch0/y0;->E:Lcom/whoop/navigation/ChatEntrypointExperience;

    iget-object v6, v0, Lch0/y0;->F:Lbc3/c0;

    iget-object v7, v0, Lch0/y0;->G:Lc93/a;

    iget-object v8, v0, Lch0/y0;->H:Lg1/y3;

    iget-object v9, v0, Lch0/y0;->I:Lg1/y3;

    iget-boolean v10, v0, Lch0/y0;->J:Z

    iget-boolean v11, v0, Lch0/y0;->K:Z

    iget-object v12, v0, Lch0/y0;->L:Landroidx/compose/ui/Modifier;

    iget-object v13, v0, Lch0/y0;->M:Lp1/c1;

    iget-object v14, v0, Lch0/y0;->N:Landroidx/compose/ui/Modifier;

    invoke-static/range {v1 .. v16}, Lch0/c1;->a(ZLzg0/i;Lch0/v0;ZLcom/whoop/navigation/ChatEntrypointExperience;Lbc3/c0;Lc93/a;Lg1/y3;Lg1/y3;ZZLandroidx/compose/ui/Modifier;Lp1/c1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method

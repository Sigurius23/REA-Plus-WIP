.class public final synthetic Lch0/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lsl0/n2;

.field public final synthetic F:Lsl0/r1;

.field public final synthetic G:Lc93/a;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lc93/n;

.field public final synthetic J:Lc93/m;

.field public final synthetic K:Lc93/m;

.field public final synthetic L:Lg2/v;

.field public final synthetic M:Lc93/a;

.field public final synthetic N:Lsl0/x1;

.field public final synthetic w:Z

.field public final synthetic x:Lzg0/i;

.field public final synthetic y:Z

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(ZLzg0/i;ZZLsl0/n2;Lsl0/r1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/n;Lc93/m;Lc93/m;Lg2/v;Lc93/a;Lsl0/x1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lch0/i0;->w:Z

    iput-object p2, p0, Lch0/i0;->x:Lzg0/i;

    iput-boolean p3, p0, Lch0/i0;->y:Z

    iput-boolean p4, p0, Lch0/i0;->z:Z

    iput-object p5, p0, Lch0/i0;->E:Lsl0/n2;

    iput-object p6, p0, Lch0/i0;->F:Lsl0/r1;

    iput-object p7, p0, Lch0/i0;->G:Lc93/a;

    iput-object p8, p0, Lch0/i0;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lch0/i0;->I:Lc93/n;

    iput-object p10, p0, Lch0/i0;->J:Lc93/m;

    iput-object p11, p0, Lch0/i0;->K:Lc93/m;

    iput-object p12, p0, Lch0/i0;->L:Lg2/v;

    iput-object p13, p0, Lch0/i0;->M:Lc93/a;

    iput-object p14, p0, Lch0/i0;->N:Lsl0/x1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    check-cast v15, Lc0/i0;

    move-object/from16 v16, p2

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p3

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-boolean v1, v0, Lch0/i0;->w:Z

    iget-object v2, v0, Lch0/i0;->x:Lzg0/i;

    iget-boolean v3, v0, Lch0/i0;->y:Z

    iget-boolean v4, v0, Lch0/i0;->z:Z

    iget-object v5, v0, Lch0/i0;->E:Lsl0/n2;

    iget-object v6, v0, Lch0/i0;->F:Lsl0/r1;

    iget-object v7, v0, Lch0/i0;->G:Lc93/a;

    iget-object v8, v0, Lch0/i0;->H:Lkotlin/jvm/functions/Function1;

    iget-object v9, v0, Lch0/i0;->I:Lc93/n;

    iget-object v10, v0, Lch0/i0;->J:Lc93/m;

    iget-object v11, v0, Lch0/i0;->K:Lc93/m;

    iget-object v12, v0, Lch0/i0;->L:Lg2/v;

    iget-object v13, v0, Lch0/i0;->M:Lc93/a;

    iget-object v14, v0, Lch0/i0;->N:Lsl0/x1;

    invoke-static/range {v1 .. v17}, Lch0/m0;->t(ZLzg0/i;ZZLsl0/n2;Lsl0/r1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/n;Lc93/m;Lc93/m;Lg2/v;Lc93/a;Lsl0/x1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method

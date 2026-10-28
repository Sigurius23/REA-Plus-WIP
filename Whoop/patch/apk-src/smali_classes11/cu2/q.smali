.class public final synthetic Lcu2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lj02/o0;

.field public final synthetic F:Lfi0/a;

.field public final synthetic G:Lrr2/c;

.field public final synthetic H:Lin2/d;

.field public final synthetic I:Landroidx/lifecycle/g0;

.field public final synthetic J:Z

.field public final synthetic K:Ljava/lang/String;

.field public final synthetic L:Lc93/a;

.field public final synthetic M:I

.field public final synthetic N:I

.field public final synthetic O:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Leb/u0;

.field public final synthetic z:Leb/a0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcu2/q;->w:Ljava/lang/String;

    iput-object p2, p0, Lcu2/q;->x:Ljava/lang/String;

    iput-object p3, p0, Lcu2/q;->y:Leb/u0;

    iput-object p4, p0, Lcu2/q;->z:Leb/a0;

    iput-object p5, p0, Lcu2/q;->E:Lj02/o0;

    iput-object p6, p0, Lcu2/q;->F:Lfi0/a;

    iput-object p7, p0, Lcu2/q;->G:Lrr2/c;

    iput-object p8, p0, Lcu2/q;->H:Lin2/d;

    iput-object p9, p0, Lcu2/q;->I:Landroidx/lifecycle/g0;

    iput-boolean p10, p0, Lcu2/q;->J:Z

    iput-object p11, p0, Lcu2/q;->K:Ljava/lang/String;

    iput-object p12, p0, Lcu2/q;->L:Lc93/a;

    iput p13, p0, Lcu2/q;->M:I

    iput p14, p0, Lcu2/q;->N:I

    iput p15, p0, Lcu2/q;->O:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v16, p1

    check-cast v16, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v17

    iget-object v1, v0, Lcu2/q;->w:Ljava/lang/String;

    iget-object v2, v0, Lcu2/q;->x:Ljava/lang/String;

    iget-object v3, v0, Lcu2/q;->y:Leb/u0;

    iget-object v4, v0, Lcu2/q;->z:Leb/a0;

    iget-object v5, v0, Lcu2/q;->E:Lj02/o0;

    iget-object v6, v0, Lcu2/q;->F:Lfi0/a;

    iget-object v7, v0, Lcu2/q;->G:Lrr2/c;

    iget-object v8, v0, Lcu2/q;->H:Lin2/d;

    iget-object v9, v0, Lcu2/q;->I:Landroidx/lifecycle/g0;

    iget-boolean v10, v0, Lcu2/q;->J:Z

    iget-object v11, v0, Lcu2/q;->K:Ljava/lang/String;

    iget-object v12, v0, Lcu2/q;->L:Lc93/a;

    iget v13, v0, Lcu2/q;->M:I

    iget v14, v0, Lcu2/q;->N:I

    iget v15, v0, Lcu2/q;->O:I

    invoke-static/range {v1 .. v17}, Lcom/whoop/weightlifting/a;->j(Ljava/lang/String;Ljava/lang/String;Leb/u0;Leb/a0;Lj02/o0;Lfi0/a;Lrr2/c;Lin2/d;Landroidx/lifecycle/g0;ZLjava/lang/String;Lc93/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method

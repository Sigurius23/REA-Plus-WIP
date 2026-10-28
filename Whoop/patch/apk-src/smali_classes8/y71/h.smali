.class public final synthetic Ly71/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:Lb91/a;

.field public final synthetic G:J

.field public final synthetic H:J

.field public final synthetic w:Ly71/l$c;

.field public final synthetic x:Ly71/o;

.field public final synthetic y:J

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(Ly71/l$c;Ly71/o;JJJLb91/a;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly71/h;->w:Ly71/l$c;

    iput-object p2, p0, Ly71/h;->x:Ly71/o;

    iput-wide p3, p0, Ly71/h;->y:J

    iput-wide p5, p0, Ly71/h;->z:J

    iput-wide p7, p0, Ly71/h;->E:J

    iput-object p9, p0, Ly71/h;->F:Lb91/a;

    iput-wide p10, p0, Ly71/h;->G:J

    iput-wide p12, p0, Ly71/h;->H:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    check-cast v14, Landroidx/compose/runtime/Composer;

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v15

    iget-object v1, v0, Ly71/h;->w:Ly71/l$c;

    iget-object v2, v0, Ly71/h;->x:Ly71/o;

    iget-wide v3, v0, Ly71/h;->y:J

    iget-wide v5, v0, Ly71/h;->z:J

    iget-wide v7, v0, Ly71/h;->E:J

    iget-object v9, v0, Ly71/h;->F:Lb91/a;

    iget-wide v10, v0, Ly71/h;->G:J

    iget-wide v12, v0, Ly71/h;->H:J

    invoke-static/range {v1 .. v15}, Ly71/i;->b(Ly71/l$c;Ly71/o;JJJLb91/a;JJLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object v1

    return-object v1
.end method

.class public final synthetic Lhy0/g2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:J

.field public final synthetic F:J

.field public final synthetic G:Lb91/a;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Landroidx/compose/ui/Modifier;

.field public final synthetic x:Lhy0/g;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Ljava/lang/Float;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/Modifier;Lhy0/g;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhy0/g2;->w:Landroidx/compose/ui/Modifier;

    iput-object p2, p0, Lhy0/g2;->x:Lhy0/g;

    iput-object p3, p0, Lhy0/g2;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lhy0/g2;->z:Ljava/lang/Float;

    iput-wide p5, p0, Lhy0/g2;->E:J

    iput-wide p7, p0, Lhy0/g2;->F:J

    iput-object p9, p0, Lhy0/g2;->G:Lb91/a;

    iput p10, p0, Lhy0/g2;->H:I

    iput p11, p0, Lhy0/g2;->I:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v12

    iget-object v0, p0, Lhy0/g2;->w:Landroidx/compose/ui/Modifier;

    iget-object v1, p0, Lhy0/g2;->x:Lhy0/g;

    iget-object v2, p0, Lhy0/g2;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lhy0/g2;->z:Ljava/lang/Float;

    iget-wide v4, p0, Lhy0/g2;->E:J

    iget-wide v6, p0, Lhy0/g2;->F:J

    iget-object v8, p0, Lhy0/g2;->G:Lb91/a;

    iget v9, p0, Lhy0/g2;->H:I

    iget v10, p0, Lhy0/g2;->I:I

    invoke-static/range {v0 .. v12}, Lhy0/i2;->a(Landroidx/compose/ui/Modifier;Lhy0/g;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Lc41/s3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:J

.field public final synthetic G:I

.field public final synthetic w:I

.field public final synthetic x:J

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(IJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc41/s3;->w:I

    iput-wide p2, p0, Lc41/s3;->x:J

    iput-object p4, p0, Lc41/s3;->y:Lcom/whoop/design/util/TextResource;

    iput-wide p5, p0, Lc41/s3;->z:J

    iput-object p7, p0, Lc41/s3;->E:Lcom/whoop/design/util/TextResource;

    iput-wide p8, p0, Lc41/s3;->F:J

    iput p10, p0, Lc41/s3;->G:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget v0, p0, Lc41/s3;->w:I

    iget-wide v1, p0, Lc41/s3;->x:J

    iget-object v3, p0, Lc41/s3;->y:Lcom/whoop/design/util/TextResource;

    iget-wide v4, p0, Lc41/s3;->z:J

    iget-object v6, p0, Lc41/s3;->E:Lcom/whoop/design/util/TextResource;

    iget-wide v7, p0, Lc41/s3;->F:J

    iget v9, p0, Lc41/s3;->G:I

    invoke-static/range {v0 .. v11}, Lc41/u3;->b(IJLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

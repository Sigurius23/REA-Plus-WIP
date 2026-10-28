.class public final synthetic Ljy0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkd1/o;

.field public final synthetic F:Lcom/whoop/design/util/TextResource;

.field public final synthetic G:Lgz0/m0;

.field public final synthetic H:I

.field public final synthetic I:I

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Li91/a;

.field public final synthetic z:J


# direct methods
.method public synthetic constructor <init>(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ljy0/a;->w:Z

    iput-boolean p2, p0, Ljy0/a;->x:Z

    iput-object p3, p0, Ljy0/a;->y:Li91/a;

    iput-wide p4, p0, Ljy0/a;->z:J

    iput-object p6, p0, Ljy0/a;->E:Lkd1/o;

    iput-object p7, p0, Ljy0/a;->F:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Ljy0/a;->G:Lgz0/m0;

    iput p9, p0, Ljy0/a;->H:I

    iput p10, p0, Ljy0/a;->I:I

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

    iget-boolean v0, p0, Ljy0/a;->w:Z

    iget-boolean v1, p0, Ljy0/a;->x:Z

    iget-object v2, p0, Ljy0/a;->y:Li91/a;

    iget-wide v3, p0, Ljy0/a;->z:J

    iget-object v5, p0, Ljy0/a;->E:Lkd1/o;

    iget-object v6, p0, Ljy0/a;->F:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Ljy0/a;->G:Lgz0/m0;

    iget v8, p0, Ljy0/a;->H:I

    iget v9, p0, Ljy0/a;->I:I

    invoke-static/range {v0 .. v11}, Ljy0/b;->a(ZZLi91/a;JLkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

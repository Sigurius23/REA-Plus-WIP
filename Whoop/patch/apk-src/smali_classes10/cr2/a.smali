.class public final synthetic Lcr2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Lhy0/b2;

.field public final synthetic G:Z

.field public final synthetic H:J

.field public final synthetic I:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:Lcom/whoop/design/util/TextResource;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lcr2/h;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;ZJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcr2/a;->w:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lcr2/a;->x:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcr2/a;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcr2/a;->z:Lcr2/h;

    iput-object p5, p0, Lcr2/a;->E:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcr2/a;->F:Lhy0/b2;

    iput-boolean p7, p0, Lcr2/a;->G:Z

    iput-wide p8, p0, Lcr2/a;->H:J

    iput p10, p0, Lcr2/a;->I:I

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

    iget-object v0, p0, Lcr2/a;->w:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcr2/a;->x:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcr2/a;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcr2/a;->z:Lcr2/h;

    iget-object v4, p0, Lcr2/a;->E:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcr2/a;->F:Lhy0/b2;

    iget-boolean v6, p0, Lcr2/a;->G:Z

    iget-wide v7, p0, Lcr2/a;->H:J

    iget v9, p0, Lcr2/a;->I:I

    invoke-static/range {v0 .. v11}, Lcr2/b;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;ZJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

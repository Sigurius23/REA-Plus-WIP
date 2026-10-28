.class public final synthetic Lb11/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lcom/whoop/design/util/TextResource;

.field public final synthetic F:Z

.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic w:J

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(JJIILcom/whoop/design/util/TextResource;ZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lb11/f;->w:J

    iput-wide p3, p0, Lb11/f;->x:J

    iput p5, p0, Lb11/f;->y:I

    iput p6, p0, Lb11/f;->z:I

    iput-object p7, p0, Lb11/f;->E:Lcom/whoop/design/util/TextResource;

    iput-boolean p8, p0, Lb11/f;->F:Z

    iput p9, p0, Lb11/f;->G:I

    iput p10, p0, Lb11/f;->H:I

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

    iget-wide v0, p0, Lb11/f;->w:J

    iget-wide v2, p0, Lb11/f;->x:J

    iget v4, p0, Lb11/f;->y:I

    iget v5, p0, Lb11/f;->z:I

    iget-object v6, p0, Lb11/f;->E:Lcom/whoop/design/util/TextResource;

    iget-boolean v7, p0, Lb11/f;->F:Z

    iget v8, p0, Lb11/f;->G:I

    iget v9, p0, Lb11/f;->H:I

    invoke-static/range {v0 .. v11}, Lb11/g;->d(JJIILcom/whoop/design/util/TextResource;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

.class public final synthetic Li21/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Lcom/whoop/design/util/TextResource;

.field public final synthetic x:J

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;JIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li21/h;->w:Lcom/whoop/design/util/TextResource;

    iput-wide p2, p0, Li21/h;->x:J

    iput p4, p0, Li21/h;->y:I

    iput p5, p0, Li21/h;->z:I

    iput p6, p0, Li21/h;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    iget-object v0, p0, Li21/h;->w:Lcom/whoop/design/util/TextResource;

    iget-wide v1, p0, Li21/h;->x:J

    iget v3, p0, Li21/h;->y:I

    iget v4, p0, Li21/h;->z:I

    iget v5, p0, Li21/h;->E:I

    invoke-static/range {v0 .. v7}, Li21/i;->e(Lcom/whoop/design/util/TextResource;JIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

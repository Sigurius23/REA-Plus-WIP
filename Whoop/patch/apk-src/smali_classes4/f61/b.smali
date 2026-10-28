.class public final synthetic Lf61/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:I

.field public final synthetic w:Lf61/i;

.field public final synthetic x:Lh2/c;

.field public final synthetic y:Lcom/whoop/design/util/TextResource;

.field public final synthetic z:Lp91/a;


# direct methods
.method public synthetic constructor <init>(Lf61/i;Lh2/c;Lcom/whoop/design/util/TextResource;Lp91/a;FI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/b;->w:Lf61/i;

    iput-object p2, p0, Lf61/b;->x:Lh2/c;

    iput-object p3, p0, Lf61/b;->y:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lf61/b;->z:Lp91/a;

    iput p5, p0, Lf61/b;->E:F

    iput p6, p0, Lf61/b;->F:I

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

    iget-object v0, p0, Lf61/b;->w:Lf61/i;

    iget-object v1, p0, Lf61/b;->x:Lh2/c;

    iget-object v2, p0, Lf61/b;->y:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lf61/b;->z:Lp91/a;

    iget v4, p0, Lf61/b;->E:F

    iget v5, p0, Lf61/b;->F:I

    invoke-static/range {v0 .. v7}, Lf61/i;->m(Lf61/i;Lh2/c;Lcom/whoop/design/util/TextResource;Lp91/a;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

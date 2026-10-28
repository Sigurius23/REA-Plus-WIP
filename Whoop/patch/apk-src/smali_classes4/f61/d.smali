.class public final synthetic Lf61/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:I

.field public final synthetic w:Lf61/i;

.field public final synthetic x:Lg61/b;

.field public final synthetic y:Li61/b;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Lf61/i;Lg61/b;Li61/b;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf61/d;->w:Lf61/i;

    iput-object p2, p0, Lf61/d;->x:Lg61/b;

    iput-object p3, p0, Lf61/d;->y:Li61/b;

    iput-boolean p4, p0, Lf61/d;->z:Z

    iput p5, p0, Lf61/d;->E:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lf61/d;->w:Lf61/i;

    iget-object v1, p0, Lf61/d;->x:Lg61/b;

    iget-object v2, p0, Lf61/d;->y:Li61/b;

    iget-boolean v3, p0, Lf61/d;->z:Z

    iget v4, p0, Lf61/d;->E:I

    invoke-static/range {v0 .. v6}, Lf61/i;->n(Lf61/i;Lg61/b;Li61/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

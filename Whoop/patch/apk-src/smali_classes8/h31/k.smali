.class public final synthetic Lh31/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Li2/t;

.field public final synthetic F:F

.field public final synthetic w:F

.field public final synthetic x:[F

.field public final synthetic y:F

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(F[FFZLi2/t;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lh31/k;->w:F

    iput-object p2, p0, Lh31/k;->x:[F

    iput p3, p0, Lh31/k;->y:F

    iput-boolean p4, p0, Lh31/k;->z:Z

    iput-object p5, p0, Lh31/k;->E:Li2/t;

    iput p6, p0, Lh31/k;->F:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v5, p0, Lh31/k;->F:F

    move-object v6, p1

    check-cast v6, Lk2/c;

    iget v0, p0, Lh31/k;->w:F

    iget-object v1, p0, Lh31/k;->x:[F

    iget v2, p0, Lh31/k;->y:F

    iget-boolean v3, p0, Lh31/k;->z:Z

    iget-object v4, p0, Lh31/k;->E:Li2/t;

    invoke-static/range {v0 .. v6}, Lh31/l;->b(F[FFZLi2/t;FLk2/c;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

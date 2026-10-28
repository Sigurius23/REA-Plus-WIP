.class public final synthetic Lcp0/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:Z

.field public final synthetic x:Z

.field public final synthetic y:Z

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ZZZLp1/c1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcp0/b0;->w:Z

    iput-boolean p2, p0, Lcp0/b0;->x:Z

    iput-boolean p3, p0, Lcp0/b0;->y:Z

    iput-object p4, p0, Lcp0/b0;->z:Lp1/c1;

    iput-object p5, p0, Lcp0/b0;->E:Lp1/c1;

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

    iget-boolean v0, p0, Lcp0/b0;->w:Z

    iget-boolean v1, p0, Lcp0/b0;->x:Z

    iget-boolean v2, p0, Lcp0/b0;->y:Z

    iget-object v3, p0, Lcp0/b0;->z:Lp1/c1;

    iget-object v4, p0, Lcp0/b0;->E:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lcp0/j0;->o(ZZZLp1/c1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

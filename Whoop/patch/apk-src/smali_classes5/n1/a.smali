.class public final synthetic Ln1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Li2/a1;

.field public final synthetic w:Ly2/j1;

.field public final synthetic x:Ln1/o;

.field public final synthetic y:Z

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ly2/j1;Ln1/o;ZFFLi2/a1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/a;->w:Ly2/j1;

    iput-object p2, p0, Ln1/a;->x:Ln1/o;

    iput-boolean p3, p0, Ln1/a;->y:Z

    iput p4, p0, Ln1/a;->z:F

    iput p5, p0, Ln1/a;->E:F

    iput-object p6, p0, Ln1/a;->F:Li2/a1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v0, p1

    check-cast v0, Ly2/i1;

    new-instance v1, Ln1/b;

    iget-object v2, p0, Ln1/a;->x:Ln1/o;

    iget-boolean v3, p0, Ln1/a;->y:Z

    iget v4, p0, Ln1/a;->z:F

    iget v5, p0, Ln1/a;->E:F

    iget-object v6, p0, Ln1/a;->F:Li2/a1;

    invoke-direct/range {v1 .. v6}, Ln1/b;-><init>(Ln1/o;ZFFLi2/a1;)V

    const/4 v5, 0x4

    move-object v4, v1

    iget-object v1, p0, Ln1/a;->w:Ly2/j1;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Ly2/i1;->s(Ly2/i1;Ly2/j1;IILkotlin/jvm/functions/Function1;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

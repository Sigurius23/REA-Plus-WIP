.class public final synthetic Lbp0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/z0;

.field public final synthetic F:Lp1/z0;

.field public final synthetic G:Lp1/z0;

.field public final synthetic H:Lp1/z0;

.field public final synthetic I:Lp1/z0;

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:Lcp0/t;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(FFLcp0/t;Lp1/c1;Lp1/z0;Lp1/z0;Lp1/z0;Lp1/z0;Lp1/z0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lbp0/i;->w:F

    iput p2, p0, Lbp0/i;->x:F

    iput-object p3, p0, Lbp0/i;->y:Lcp0/t;

    iput-object p4, p0, Lbp0/i;->z:Lp1/c1;

    iput-object p5, p0, Lbp0/i;->E:Lp1/z0;

    iput-object p6, p0, Lbp0/i;->F:Lp1/z0;

    iput-object p7, p0, Lbp0/i;->G:Lp1/z0;

    iput-object p8, p0, Lbp0/i;->H:Lp1/z0;

    iput-object p9, p0, Lbp0/i;->I:Lp1/z0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v8, p0, Lbp0/i;->I:Lp1/z0;

    move-object v9, p1

    check-cast v9, Ly2/y;

    iget v0, p0, Lbp0/i;->w:F

    iget v1, p0, Lbp0/i;->x:F

    iget-object v2, p0, Lbp0/i;->y:Lcp0/t;

    iget-object v3, p0, Lbp0/i;->z:Lp1/c1;

    iget-object v4, p0, Lbp0/i;->E:Lp1/z0;

    iget-object v5, p0, Lbp0/i;->F:Lp1/z0;

    iget-object v6, p0, Lbp0/i;->G:Lp1/z0;

    iget-object v7, p0, Lbp0/i;->H:Lp1/z0;

    invoke-static/range {v0 .. v9}, Lbp0/s;->r(FFLcp0/t;Lp1/c1;Lp1/z0;Lp1/z0;Lp1/z0;Lp1/z0;Lp1/z0;Ly2/y;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

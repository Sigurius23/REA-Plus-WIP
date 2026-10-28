.class public final synthetic Lbp0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Lcp0/t;

.field public final synthetic F:Lep0/j;

.field public final synthetic G:Ldp0/g;

.field public final synthetic w:Z

.field public final synthetic x:Lch0/v0;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(ZLch0/v0;Lbc3/c0;Lp1/c1;Lcp0/t;Lep0/j;Ldp0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lbp0/j;->w:Z

    iput-object p2, p0, Lbp0/j;->x:Lch0/v0;

    iput-object p3, p0, Lbp0/j;->y:Lbc3/c0;

    iput-object p4, p0, Lbp0/j;->z:Lp1/c1;

    iput-object p5, p0, Lbp0/j;->E:Lcp0/t;

    iput-object p6, p0, Lbp0/j;->F:Lep0/j;

    iput-object p7, p0, Lbp0/j;->G:Ldp0/g;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    iget-object v5, p0, Lbp0/j;->F:Lep0/j;

    iget-object v6, p0, Lbp0/j;->G:Ldp0/g;

    iget-boolean v0, p0, Lbp0/j;->w:Z

    iget-object v1, p0, Lbp0/j;->x:Lch0/v0;

    iget-object v2, p0, Lbp0/j;->y:Lbc3/c0;

    iget-object v3, p0, Lbp0/j;->z:Lp1/c1;

    iget-object v4, p0, Lbp0/j;->E:Lcp0/t;

    invoke-static/range {v0 .. v6}, Lbp0/s;->D(ZLch0/v0;Lbc3/c0;Lp1/c1;Lcp0/t;Lep0/j;Ldp0/g;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.class public final Lu0/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/x2;


# instance fields
.field public final synthetic a:Lh0/x2;

.field public final b:Lp1/f0;

.field public final c:Lp1/f0;


# direct methods
.method public constructor <init>(Lh0/x2;Lu0/n1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/m1;->a:Lh0/x2;

    new-instance p1, Lu0/l1;

    const/4 v0, 0x0

    invoke-direct {p1, p2, v0}, Lu0/l1;-><init>(Lu0/n1;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lu0/m1;->b:Lp1/f0;

    new-instance p1, Lu0/l1;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lu0/l1;-><init>(Lu0/n1;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lu0/m1;->c:Lp1/f0;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lu0/m1;->a:Lh0/x2;

    invoke-interface {v0, p1, p2, p3}, Lh0/x2;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lu0/m1;->a:Lh0/x2;

    invoke-interface {v0}, Lh0/x2;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lu0/m1;->c:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lu0/m1;->b:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lu0/m1;->a:Lh0/x2;

    invoke-interface {v0, p1}, Lh0/x2;->e(F)F

    move-result p1

    return p1
.end method

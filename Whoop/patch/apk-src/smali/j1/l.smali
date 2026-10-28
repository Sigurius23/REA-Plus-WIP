.class public final Lj1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Lp1/c1;

.field public final c:Lp1/f0;

.field public final d:Lp1/k1;

.field public final e:Lp1/g1;

.field public final f:Lp1/g1;

.field public final g:Lp1/g1;

.field public final h:Lp1/g1;

.field public final i:Lf0/c1;


# direct methods
.method public constructor <init>(Lbc3/c0;Lp1/c1;FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj1/l;->a:Lbc3/c0;

    iput-object p2, p0, Lj1/l;->b:Lp1/c1;

    new-instance p1, Lj1/c;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lj1/c;-><init>(Lj1/l;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lj1/l;->c:Lp1/f0;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lj1/l;->d:Lp1/k1;

    new-instance p1, Lp1/g1;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lj1/l;->e:Lp1/g1;

    new-instance p1, Lp1/g1;

    invoke-direct {p1, p2}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lj1/l;->f:Lp1/g1;

    new-instance p1, Lp1/g1;

    invoke-direct {p1, p4}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lj1/l;->g:Lp1/g1;

    new-instance p1, Lp1/g1;

    invoke-direct {p1, p3}, Lp1/g1;-><init>(F)V

    iput-object p1, p0, Lj1/l;->h:Lp1/g1;

    new-instance p1, Lf0/c1;

    invoke-direct {p1}, Lf0/c1;-><init>()V

    iput-object p1, p0, Lj1/l;->i:Lf0/c1;

    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    iget-object v0, p0, Lj1/l;->c:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lj1/l;->d:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

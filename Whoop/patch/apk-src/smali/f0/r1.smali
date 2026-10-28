.class public final Lf0/r1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/x2;


# static fields
.field public static final i:Lp0/n0;


# instance fields
.field public final a:Lp1/h1;

.field public final b:Lp1/h1;

.field public final c:Lj0/j;

.field public final d:Lp1/h1;

.field public e:F

.field public final f:Lh0/d0;

.field public final g:Lp1/f0;

.field public final h:Lp1/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lex0/a;

    const/16 v1, 0xf

    invoke-direct {v0, v1}, Lex0/a;-><init>(I)V

    new-instance v1, Lf0/q1;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lf0/q1;-><init>(I)V

    new-instance v2, Lp0/n0;

    const/16 v3, 0xa

    invoke-direct {v2, v3, v0, v1}, Lp0/n0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v2, Lf0/r1;->i:Lp0/n0;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lp1/h1;

    invoke-direct {v0, p1}, Lp1/h1;-><init>(I)V

    iput-object v0, p0, Lf0/r1;->a:Lp1/h1;

    new-instance p1, Lp1/h1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lp1/h1;-><init>(I)V

    iput-object p1, p0, Lf0/r1;->b:Lp1/h1;

    new-instance p1, Lj0/j;

    invoke-direct {p1}, Lj0/j;-><init>()V

    iput-object p1, p0, Lf0/r1;->c:Lj0/j;

    new-instance p1, Lp1/h1;

    const v0, 0x7fffffff

    invoke-direct {p1, v0}, Lp1/h1;-><init>(I)V

    iput-object p1, p0, Lf0/r1;->d:Lp1/h1;

    new-instance p1, La6/i;

    const/16 v0, 0xc

    invoke-direct {p1, p0, v0}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance v0, Lh0/d0;

    invoke-direct {v0, p1}, Lh0/d0;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lf0/r1;->f:Lh0/d0;

    new-instance p1, Lf0/p1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lf0/p1;-><init>(Lf0/r1;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lf0/r1;->g:Lp1/f0;

    new-instance p1, Lf0/p1;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lf0/p1;-><init>(Lf0/r1;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lf0/r1;->h:Lp1/f0;

    return-void
.end method


# virtual methods
.method public final a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf0/r1;->f:Lh0/d0;

    invoke-virtual {v0, p1, p2, p3}, Lh0/d0;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, Lf0/r1;->f:Lh0/d0;

    invoke-virtual {v0}, Lh0/d0;->b()Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lf0/r1;->h:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lf0/r1;->g:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final e(F)F
    .locals 1

    iget-object v0, p0, Lf0/r1;->f:Lh0/d0;

    invoke-virtual {v0, p1}, Lh0/d0;->e(F)F

    move-result p1

    return p1
.end method

.method public final f(ILd0/l;Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    invoke-static {p0, p1, p2, p3}, Lh0/q3;->c(Lh0/x2;FLd0/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final g(ILq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    invoke-static {p0, p1, p2}, Lh0/q3;->p(Lh0/x2;FLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

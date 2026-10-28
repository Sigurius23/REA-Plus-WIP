.class public final Ll1/x4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lf0/c1;

.field public final b:Ld0/q0;

.field public c:Lbc3/m;


# direct methods
.method public constructor <init>(Lf0/c1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/x4;->a:Lf0/c1;

    new-instance p1, Ld0/q0;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {p1, v0}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ll1/x4;->b:Ld0/q0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Ll1/x4;->b:Ld0/q0;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    return-void
.end method

.method public final b()Z
    .locals 2

    iget-object v0, p0, Ll1/x4;->b:Ld0/q0;

    iget-object v1, v0, Ld0/q0;->y:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Ld0/q0;->z:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final c(Lf0/z0;Ls83/i;)Ljava/lang/Object;
    .locals 6

    new-instance v2, La6/e;

    const/4 v0, 0x7

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4, v0}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance v0, La00/f;

    const/4 v5, 0x3

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, La00/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iget-object p1, v1, Ll1/x4;->a:Lf0/c1;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Landroidx/lifecycle/g1;

    invoke-direct {v2, v3, p1, v0, v4}, Landroidx/lifecycle/g1;-><init>(Lf0/z0;Lf0/c1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v2, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

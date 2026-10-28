.class public final Llb/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb/b;


# instance fields
.field public final w:Ltb/b;

.field public final x:Ljava/lang/String;

.field public final y:Lkotlin/jvm/internal/i;

.field public final z:Ll83/p;


# direct methods
.method public constructor <init>(Ltb/b;Ljava/lang/String;Lc93/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/p;->w:Ltb/b;

    iput-object p2, p0, Llb/p;->x:Ljava/lang/String;

    check-cast p3, Lkotlin/jvm/internal/i;

    iput-object p3, p0, Llb/p;->y:Lkotlin/jvm/internal/i;

    new-instance p1, La6/l0;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, La6/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llb/p;->z:Ll83/p;

    return-void
.end method


# virtual methods
.method public final A0(ZLc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 4

    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    sget-object v0, Llb/o;->x:Ljc/a;

    invoke-interface {p1, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    check-cast p1, Llb/o;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p1, Llb/o;->w:Llb/n;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-interface {p2, p1, p3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Llb/n;

    iget-object v1, p0, Llb/p;->z:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltb/a;

    iget-object v2, p0, Llb/p;->y:Lkotlin/jvm/internal/i;

    invoke-direct {p1, v2, v1}, Llb/n;-><init>(Lc93/m;Ltb/a;)V

    new-instance v1, Llb/o;

    invoke-direct {v1, p1}, Llb/o;-><init>(Llb/n;)V

    new-instance v2, La6/c;

    const/16 v3, 0x18

    invoke-direct {v2, p2, p1, v0, v3}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v2, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Llb/p;->z:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltb/a;

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    :cond_0
    return-void
.end method

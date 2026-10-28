.class public final Ls93/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/b;


# instance fields
.field public final a:Lo93/h;

.field public final b:Lva3/e;

.field public final c:Ljava/util/Map;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lo93/h;Lva3/e;Ljava/util/Map;)V
    .locals 1

    const-string v0, "builtIns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls93/l;->a:Lo93/h;

    iput-object p2, p0, Ls93/l;->b:Lva3/e;

    iput-object p3, p0, Ls93/l;->c:Ljava/util/Map;

    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance p2, Lbg/j;

    const/16 p3, 0xc

    invoke-direct {p2, p0, p3}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Ls93/l;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ls93/l;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final b()Lva3/e;
    .locals 1

    iget-object v0, p0, Ls93/l;->b:Lva3/e;

    return-object v0
.end method

.method public final getSource()Lr93/s0;
    .locals 1

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    return-object v0
.end method

.method public final getType()Llb3/y;
    .locals 2

    iget-object v0, p0, Ls93/l;->d:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Llb3/y;

    return-object v0
.end method

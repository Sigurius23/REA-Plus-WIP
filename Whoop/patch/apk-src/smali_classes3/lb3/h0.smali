.class public final Llb3/h0;
.super Llb3/u0;
.source "SourceFile"


# instance fields
.field public final a:Lr93/x0;

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr93/x0;)V
    .locals 2

    const-string v0, "typeParameter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/h0;->a:Lr93/x0;

    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance v0, Lbg/j;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Llb3/h0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Llb3/g1;
    .locals 1

    sget-object v0, Llb3/g1;->E:Llb3/g1;

    return-object v0
.end method

.method public final b()Llb3/y;
    .locals 1

    iget-object v0, p0, Llb3/h0;->b:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(Lmb3/f;)Llb3/u0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

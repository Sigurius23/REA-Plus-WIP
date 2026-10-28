.class public final Lu93/v0;
.super Lu93/w0;
.source "SourceFile"


# instance fields
.field public final M:Ll83/p;


# direct methods
.method public constructor <init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;Lc93/a;)V
    .locals 0

    invoke-direct/range {p0 .. p11}, Lu93/w0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;)V

    move-object p1, p0

    invoke-static {p12}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p2

    iput-object p2, p1, Lu93/v0;->M:Ll83/p;

    return-void
.end method


# virtual methods
.method public final o(Lp93/f;Lva3/h;I)Lr93/a1;
    .locals 13

    new-instance v0, Lu93/v0;

    invoke-virtual {p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v4

    const-string v1, "<get-annotations>(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/x0;->getType()Llb3/y;

    move-result-object v6

    const-string v1, "getType(...)"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/w0;->J0()Z

    move-result v7

    new-instance v12, Lbg/j;

    const/16 v1, 0x11

    invoke-direct {v12, p0, v1}, Lbg/j;-><init>(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    iget-boolean v8, p0, Lu93/w0;->I:Z

    iget-boolean v9, p0, Lu93/w0;->J:Z

    iget-object v10, p0, Lu93/w0;->K:Llb3/y;

    sget-object v11, Lr93/s0;->q:Lr93/v0;

    move-object v1, p1

    move-object v5, p2

    move/from16 v3, p3

    invoke-direct/range {v0 .. v12}, Lu93/v0;-><init>(Lr93/b;Lr93/a1;ILs93/i;Lva3/h;Llb3/y;ZZZLlb3/y;Lr93/s0;Lc93/a;)V

    return-object v0
.end method

.class public final Lq93/a;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;
.source "SourceFile"


# static fields
.field public static final b:Lva3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "clone"

    invoke-static {v0}, Lva3/h;->e(Ljava/lang/String;)Lva3/h;

    move-result-object v0

    sput-object v0, Lq93/a;->b:Lva3/h;

    return-void
.end method


# virtual methods
.method public final computeDeclaredFunctions()Ljava/util/List;
    .locals 13

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v0

    const/4 v1, 0x1

    sget-object v2, Lr93/s0;->q:Lr93/v0;

    sget-object v3, Lq93/a;->b:Lva3/h;

    invoke-static {v0, v3, v1, v2}, Lu93/q0;->U0(Lr93/e;Lva3/h;ILr93/s0;)Lu93/q0;

    move-result-object v4

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v0

    invoke-interface {v0}, Lr93/e;->q0()Lr93/q0;

    move-result-object v6

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;->getContainingClass()Lr93/e;

    move-result-object v0

    invoke-static {v0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    invoke-virtual {v0}, Lo93/h;->e()Llb3/c0;

    move-result-object v10

    sget-object v11, Lr93/a0;->z:Lr93/a0;

    sget-object v12, Lr93/q;->c:Lr93/p;

    const/4 v5, 0x0

    sget-object v7, Lm83/y;->w:Lm83/y;

    move-object v8, v7

    move-object v9, v7

    invoke-virtual/range {v4 .. v12}, Lu93/q0;->W0(Lr93/q0;Lr93/q0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Llb3/y;Lr93/a0;Lr93/r;)Lu93/q0;

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

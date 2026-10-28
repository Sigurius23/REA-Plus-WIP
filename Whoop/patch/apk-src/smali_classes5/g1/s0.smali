.class public final Lg1/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lg1/a0;

.field public final b:Lg1/o2;


# direct methods
.method public constructor <init>(Lg1/t0;Ly3/c;Lkotlin/jvm/functions/Function1;Ld0/l;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lg1/a0;

    new-instance v2, Lg1/q0;

    const/4 v1, 0x0

    invoke-direct {v2, v1, p2}, Lg1/q0;-><init>(ILy3/c;)V

    new-instance v3, Lg1/r0;

    invoke-direct {v3, v1, p2}, Lg1/r0;-><init>(ILy3/c;)V

    move-object v1, p1

    move-object v5, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lg1/a0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lc93/a;Ld0/l;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, p0, Lg1/s0;->a:Lg1/a0;

    sget p1, Lg1/p2;->a:F

    new-instance p1, Lg1/o2;

    invoke-direct {p1, v0}, Lg1/o2;-><init>(Lg1/a0;)V

    iput-object p1, p0, Lg1/s0;->b:Lg1/o2;

    return-void
.end method


# virtual methods
.method public final a(Ls83/i;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lg1/s0;->a:Lg1/a0;

    sget-object v1, Lg1/t0;->w:Lg1/t0;

    invoke-static {v0, v1, p1}, Lcom/squareup/wire/n;->n(Lg1/a0;Ljava/lang/Object;Ls83/i;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

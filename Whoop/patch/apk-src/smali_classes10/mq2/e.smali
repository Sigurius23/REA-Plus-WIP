.class public final synthetic Lmq2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Lp1/t2;

.field public final synthetic w:F

.field public final synthetic x:Lp1/c1;

.field public final synthetic y:Lp1/c1;

.field public final synthetic z:Lp1/t2;


# direct methods
.method public synthetic constructor <init>(FLp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lmq2/e;->w:F

    iput-object p2, p0, Lmq2/e;->x:Lp1/c1;

    iput-object p3, p0, Lmq2/e;->y:Lp1/c1;

    iput-object p4, p0, Lmq2/e;->z:Lp1/t2;

    iput-object p5, p0, Lmq2/e;->E:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v4, p0, Lmq2/e;->E:Lp1/t2;

    move-object v5, p1

    check-cast v5, Li2/g0;

    iget v0, p0, Lmq2/e;->w:F

    iget-object v1, p0, Lmq2/e;->x:Lp1/c1;

    iget-object v2, p0, Lmq2/e;->y:Lp1/c1;

    iget-object v3, p0, Lmq2/e;->z:Lp1/t2;

    invoke-static/range {v0 .. v5}, Lmq2/g;->a(FLp1/c1;Lp1/c1;Lp1/t2;Lp1/t2;Li2/g0;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method

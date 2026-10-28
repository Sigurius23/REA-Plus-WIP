.class public final synthetic Lp91/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Lp91/a;

.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(FFFFLp91/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp91/b;->w:F

    iput p2, p0, Lp91/b;->x:F

    iput p3, p0, Lp91/b;->y:F

    iput p4, p0, Lp91/b;->z:F

    iput-object p5, p0, Lp91/b;->E:Lp91/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v5, p1

    check-cast v5, Ly2/t0;

    move-object v6, p2

    check-cast v6, Ly2/q0;

    move-object v7, p3

    check-cast v7, Ly3/a;

    iget v0, p0, Lp91/b;->w:F

    iget v1, p0, Lp91/b;->x:F

    iget v2, p0, Lp91/b;->y:F

    iget v3, p0, Lp91/b;->z:F

    iget-object v4, p0, Lp91/b;->E:Lp91/a;

    invoke-static/range {v0 .. v7}, Lp91/e;->a(FFFFLp91/a;Ly2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

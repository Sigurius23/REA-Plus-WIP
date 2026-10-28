.class public final synthetic Lp91/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F

.field public final synthetic y:Lp91/a;


# direct methods
.method public synthetic constructor <init>(FFLp91/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lp91/c;->w:F

    iput p2, p0, Lp91/c;->x:F

    iput-object p3, p0, Lp91/c;->y:Lp91/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v3, p1

    check-cast v3, Ly2/t0;

    move-object v4, p2

    check-cast v4, Ly2/q0;

    move-object v5, p3

    check-cast v5, Ly3/a;

    iget v0, p0, Lp91/c;->w:F

    iget v1, p0, Lp91/c;->x:F

    iget-object v2, p0, Lp91/c;->y:Lp91/a;

    invoke-static/range {v0 .. v5}, Lp91/e;->d(FFLp91/a;Ly2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

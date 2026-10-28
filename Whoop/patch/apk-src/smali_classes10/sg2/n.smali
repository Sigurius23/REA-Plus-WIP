.class public final synthetic Lsg2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic w:F

.field public final synthetic x:F


# direct methods
.method public synthetic constructor <init>(FF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lsg2/n;->w:F

    iput p2, p0, Lsg2/n;->x:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly2/t0;

    check-cast p2, Ly2/q0;

    check-cast p3, Ly3/a;

    iget v0, p0, Lsg2/n;->w:F

    iget v1, p0, Lsg2/n;->x:F

    invoke-static {v0, v1, p1, p2, p3}, Lsg2/p;->d(FFLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method

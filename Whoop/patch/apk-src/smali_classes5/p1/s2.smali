.class public final Lp1/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ld93/a;


# instance fields
.field public final w:Lp1/f2;

.field public final x:I

.field public final y:Lp1/b;


# direct methods
.method public constructor <init>(Lp1/f2;ILp1/n0;Lp1/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/s2;->w:Lp1/f2;

    iput p2, p0, Lp1/s2;->x:I

    iput-object p4, p0, Lp1/s2;->y:Lp1/b;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 5

    new-instance v0, Lp1/m0;

    const/4 v1, 0x0

    iget-object v2, p0, Lp1/s2;->y:Lp1/b;

    iget-object v3, p0, Lp1/s2;->w:Lp1/f2;

    iget v4, p0, Lp1/s2;->x:I

    invoke-direct {v0, v3, v4, v1, v2}, Lp1/m0;-><init>(Lp1/f2;ILp1/n0;Lse/b;)V

    return-object v0
.end method

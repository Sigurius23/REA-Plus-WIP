.class public final Lc0/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lc0/c1;

.field public final b:Lc0/e1;

.field public final c:Lp1/g1;

.field public d:Lc0/r1;


# direct methods
.method public constructor <init>(Lc0/c1;Lc0/e1;FLc0/r1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc0/l0;->a:Lc0/c1;

    .line 3
    iput-object p2, p0, Lc0/l0;->b:Lc0/e1;

    .line 4
    new-instance p1, Lp1/g1;

    invoke-direct {p1, p3}, Lp1/g1;-><init>(F)V

    .line 5
    iput-object p1, p0, Lc0/l0;->c:Lp1/g1;

    .line 6
    iput-object p4, p0, Lc0/l0;->d:Lc0/r1;

    return-void
.end method

.method public constructor <init>(Lc0/d1;Lc0/f1;Lc0/r1;I)V
    .locals 1

    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_0

    .line 7
    sget p3, Landroidx/compose/animation/a;->b:I

    .line 8
    sget-object p3, Lc0/l;->x:Lc0/l;

    .line 9
    new-instance p4, Lc0/r1;

    const/4 v0, 0x1

    invoke-direct {p4, v0, p3}, Lc0/r1;-><init>(ZLc93/m;)V

    move-object p3, p4

    :cond_0
    const/4 p4, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p4, p3}, Lc0/l0;-><init>(Lc0/c1;Lc0/e1;FLc0/r1;)V

    return-void
.end method

.class public final La2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq1/k0;
.implements Lq83/h;


# static fields
.field public static final x:Lqt/e;


# instance fields
.field public final w:Lp1/q;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, La2/c;->x:Lqt/e;

    return-void
.end method

.method public constructor <init>(Lp1/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/c;->w:Lp1/q;

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Integer;)Ljava/util/List;
    .locals 0

    iget-object p1, p0, La2/c;->w:Lp1/q;

    invoke-virtual {p1}, Lp1/q;->K()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, La2/c;->x:Lqt/e;

    return-object v0
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

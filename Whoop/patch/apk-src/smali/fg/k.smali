.class public final Lfg/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lqt/e;


# instance fields
.field public final a:Lfg/j;

.field public final b:Lg93/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqt/e;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lqt/e;-><init>(I)V

    sput-object v0, Lfg/k;->c:Lqt/e;

    return-void
.end method

.method public constructor <init>(Lfg/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfg/k;->a:Lfg/j;

    sget-object p1, Lg93/d;->w:Lg93/c;

    iput-object p1, p0, Lfg/k;->b:Lg93/c;

    return-void
.end method


# virtual methods
.method public final a(ILeg/l;)Ljava/lang/Object;
    .locals 7

    if-lez p1, :cond_2

    iget-object v0, p0, Lfg/k;->a:Lfg/j;

    iget-wide v1, v0, Lfg/j;->a:J

    invoke-static {v1, v2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v1

    long-to-double v1, v1

    iget-wide v3, v0, Lfg/j;->b:D

    add-int/lit8 p1, p1, -0x1

    int-to-double v5, p1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    mul-double/2addr v3, v1

    iget-wide v1, v0, Lfg/j;->d:J

    sget-object p1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v2, p1}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v1

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v1

    iget-wide v3, v0, Lfg/j;->c:D

    const-wide/16 v5, 0x0

    cmpl-double p1, v3, v5

    if-lez p1, :cond_0

    iget-object p1, p0, Lfg/k;->b:Lg93/c;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lg93/d;->x:Lg93/a;

    invoke-virtual {p1, v3, v4}, Lg93/d;->c(D)D

    move-result-wide v5

    :cond_0
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v5

    mul-double/2addr v3, v1

    double-to-long v0, v3

    invoke-static {v0, v1, p2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    const-string p2, "attempt was "

    const-string v0, " but must be greater than 0"

    invoke-static {p1, p2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

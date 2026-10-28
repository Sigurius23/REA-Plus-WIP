.class public final Lpf/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/h;


# static fields
.field public static final x:Lpf/s;


# instance fields
.field public final w:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lpf/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lpf/u;->x:Lpf/s;

    return-void
.end method

.method public constructor <init>(Lq83/j;)V
    .locals 1

    const-string v0, "callContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpf/u;->w:Lq83/j;

    return-void
.end method


# virtual methods
.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge get(Lq83/i;)Lq83/h;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, Lpf/u;->x:Lpf/s;

    return-object v0
.end method

.method public final bridge minusKey(Lq83/i;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final bridge plus(Lq83/j;)Lq83/j;
    .locals 0

    invoke-static {p0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

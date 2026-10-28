.class public final Lpg3/s;
.super Lpg3/v;
.source "SourceFile"


# instance fields
.field public final d:Lpg3/g;


# direct methods
.method public constructor <init>(Lpg3/u0;Lud3/i;Lpg3/n;Lpg3/g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lpg3/v;-><init>(Lpg3/u0;Lud3/i;Lpg3/n;)V

    iput-object p4, p0, Lpg3/s;->d:Lpg3/g;

    return-void
.end method


# virtual methods
.method public final a(Lpg3/b0;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    iget-object p2, p0, Lpg3/s;->d:Lpg3/g;

    invoke-interface {p2, p1}, Lpg3/g;->adapt(Lpg3/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

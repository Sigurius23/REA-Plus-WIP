.class public final Lu0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj0/i;

.field public final b:Lp1/h1;


# direct methods
.method public constructor <init>(Lj0/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/t0;->a:Lj0/i;

    new-instance p1, Lp1/h1;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lp1/h1;-><init>(I)V

    iput-object p1, p0, Lu0/t0;->b:Lp1/h1;

    return-void
.end method

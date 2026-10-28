.class public final Lh0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/a4;


# instance fields
.field public final a:Lea2/g;

.field public final b:Lh0/e0;

.field public final c:Lf0/c1;

.field public final d:Lp1/k1;


# direct methods
.method public constructor <init>(Lea2/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh0/f0;->a:Lea2/g;

    new-instance p1, Lh0/e0;

    invoke-direct {p1, p0}, Lh0/e0;-><init>(Lh0/f0;)V

    iput-object p1, p0, Lh0/f0;->b:Lh0/e0;

    new-instance p1, Lf0/c1;

    invoke-direct {p1}, Lf0/c1;-><init>()V

    iput-object p1, p0, Lh0/f0;->c:Lf0/c1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lh0/f0;->d:Lp1/k1;

    return-void
.end method

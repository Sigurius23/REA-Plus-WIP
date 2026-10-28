.class public final Lh/e;
.super Lg/t;
.source "SourceFile"


# instance fields
.field public final synthetic d:Lp1/c1;


# direct methods
.method public constructor <init>(ZLp1/c1;)V
    .locals 0

    iput-object p2, p0, Lh/e;->d:Lp1/c1;

    invoke-direct {p0, p1}, Lg/t;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    iget-object v0, p0, Lh/e;->d:Lp1/c1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

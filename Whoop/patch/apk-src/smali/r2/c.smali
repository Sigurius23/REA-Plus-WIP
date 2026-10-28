.class public final Lr2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr2/b;


# instance fields
.field public final a:Lp1/k1;


# direct methods
.method public constructor <init>(ILb3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p2, Lr2/a;

    invoke-direct {p2, p1}, Lr2/a;-><init>(I)V

    invoke-static {p2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lr2/c;->a:Lp1/k1;

    return-void
.end method

.class public final Lf6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/g;


# instance fields
.field public final a:La6/g;


# direct methods
.method public constructor <init>(La6/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/b;->a:La6/g;

    return-void
.end method


# virtual methods
.method public final a(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Landroidx/lifecycle/d1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, p1, v1, v2}, Landroidx/lifecycle/d1;-><init>(Lc93/m;Lq83/d;I)V

    iget-object p1, p0, Lf6/b;->a:La6/g;

    invoke-interface {p1, v0, p2}, La6/g;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getData()Lec3/l;
    .locals 1

    iget-object v0, p0, Lf6/b;->a:La6/g;

    invoke-interface {v0}, La6/g;->getData()Lec3/l;

    move-result-object v0

    return-object v0
.end method

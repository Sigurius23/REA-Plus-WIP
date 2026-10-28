.class public final Lxi/d;
.super Lal/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x7

    invoke-direct {p0, p1, v0}, Lal/a;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final k0()Lti/d;
    .locals 2

    new-instance v0, Lti/p;

    iget-object v1, p0, Lal/a;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-direct {v0, v1}, Lti/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.class public final Lec3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/d;


# instance fields
.field public final w:Lec3/l;


# direct methods
.method public constructor <init>(Lec3/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lec3/f;->w:Lec3/l;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lw;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lw;-><init>(Lec3/m;I)V

    iget-object p1, p0, Lec3/f;->w:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
